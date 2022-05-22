package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView RecyclerView;
    private MyAdapter adapter;
    private ArrayList<Items> listOfItems;

    private Button intentButton;
    private String TAG = "==>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView = findViewById(R.id.recycler_view);
        listOfItems = new ArrayList<Items>();
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter(listOfItems);
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
}