package com.tri.recyclerview_news_screen;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private final ItemListAdapter mAdapter;
    public final TextView pItemView;

    public ItemViewHolder(@NonNull View itemView, ItemListAdapter adapter) {
        super(itemView);

        pItemView = itemView.findViewById(R.id.item);
        this.mAdapter = adapter;

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
