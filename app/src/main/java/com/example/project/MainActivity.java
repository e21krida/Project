package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView RecyclerView;
    private MyAdapter adapter;
    private ArrayList<Items> listOfItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView = findViewById(R.id.recycler_view);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter(listOfItems);
        RecyclerView.setAdapter(adapter);

    }
}