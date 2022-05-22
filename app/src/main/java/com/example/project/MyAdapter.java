package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<Items> listOfItems;
    public MyAdapter(ArrayList<Items> listOfItems) {
        this.listOfItems = listOfItems;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_items, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.login.setText(listOfItems.get(position).getLogin());
        holder.ID.setText(String.valueOf(listOfItems.get(position).getID()));

    }

    @Override
    public int getItemCount() {
        return listOfItems.size();
    }
}
