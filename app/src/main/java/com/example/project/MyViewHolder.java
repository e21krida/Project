package com.example.project;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView ID;
    public TextView Category;
    public TextView Location;
    public TextView Name;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        ID = itemView.findViewById(R.id.ID);
        Category = itemView.findViewById(R.id.Category);
        Name = itemView.findViewById(R.id.Name);
        Location = itemView.findViewById(R.id.Location);
    }
}
