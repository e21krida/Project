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
        holder.ID.setText(listOfItems.get(position).getID());
        holder.Category.setText(listOfItems.get(position).getCategory());
        holder.Location.setText(listOfItems.get(position).getLocation());
        holder.Name.setText(listOfItems.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return listOfItems.size();
    }
}
