package com.tri.recyclerview_news_screen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private final LinkedList<String> mItemList;
    private final LayoutInflater mInflater;

    public ItemListAdapter(Context context, LinkedList<String> itemList) {
        mInflater = LayoutInflater.from(context);
        this.mItemList = itemList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemview = mInflater.inflate(R.layout.list_item, parent, false);
        return new ItemViewHolder(mItemview, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        String mCurrent = mItemList.get(position);
        holder.pItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }
}
