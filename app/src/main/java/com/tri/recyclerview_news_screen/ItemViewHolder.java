package com.tri.recyclerview_news_screen;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private final ItemListAdapter mAdapter;
    public final TextView tv_title;
    public final TextView tv_content;
    private final Context context;

    public ItemViewHolder(@NonNull View itemView, ItemListAdapter adapter) {
        super(itemView);

        this.tv_title = itemView.findViewById(R.id.tv_title);
        this.tv_content = itemView.findViewById(R.id.tv_content);
        this.mAdapter = adapter;

        this.context = itemView.getContext();

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent toNewsDetails = new Intent(context, NewsDetails.class);
        context.startActivity(toNewsDetails);
    }
}
