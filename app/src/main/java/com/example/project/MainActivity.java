package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {
    private RecyclerView RecyclerView;
    private MyAdapter adapter;
    private ArrayList<Items> listOfItems;
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=e21krida";

    private Button intentButton;
    private String TAG = "==>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new JsonTask(this).execute(JSON_URL);

        listOfItems = new ArrayList<Items>();
        adapter = new MyAdapter(listOfItems);
        RecyclerView = findViewById(R.id.recycler_view);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView.setAdapter(adapter);

        intentButton = findViewById(R.id.mainIntent);
        intentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Intent button in MainActivity pressed");
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }
    public void onPostExecute(String json){
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Items>>(){}.getType();
        ArrayList<Items> lista = gson.fromJson(json, type);
        listOfItems.addAll(lista);
        adapter.notifyDataSetChanged();
    }
}