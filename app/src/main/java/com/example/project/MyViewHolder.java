package com.example.project;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView login;
    public TextView ID;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        login = itemView.findViewById(R.id.login);
        ID = itemView.findViewById(R.id.ID);
    }
}
