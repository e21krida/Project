package com.example.project;

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
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.login.setText(listOfItems.get(position).getLogin());

    }

    @Override
    public int getItemCount() {
        return listOfItems.size();
    }
}
