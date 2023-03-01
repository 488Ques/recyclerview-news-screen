package com.tri.recyclerview_news_screen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private final LinkedList<NewsItem> mNewsItemList;
    private final LayoutInflater mInflater;

    public ItemListAdapter(Context context, LinkedList<NewsItem> newsItemList) {
        mInflater = LayoutInflater.from(context);
        this.mNewsItemList = newsItemList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemview = mInflater.inflate(R.layout.list_item, parent, false);
        return new ItemViewHolder(mItemview, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        NewsItem mCurrent = mNewsItemList.get(position);
        holder.tv_title.setText(mCurrent.getTitle());
        holder.tv_content.setText(String.format("%1.50s ...", mCurrent.getContent()));
    }

    @Override
    public int getItemCount() {
        return mNewsItemList.size();
    }
}
