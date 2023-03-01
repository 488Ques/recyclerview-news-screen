package com.tri.recyclerview_news_screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ItemListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String sampleContent = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus sed dapibus urna. Integer faucibus massa nunc, in porta urna laoreet vel. Phasellus non mattis risus.";
        LinkedList<NewsItem> mItemList = new LinkedList<>();
        mItemList.add(new NewsItem("Title", sampleContent));
        mItemList.add(new NewsItem("Title", sampleContent));
        mItemList.add(new NewsItem("Title", sampleContent));
        mItemList.add(new NewsItem("Title", sampleContent));
        mItemList.add(new NewsItem("Title", sampleContent));
        mItemList.add(new NewsItem("Title", sampleContent));
        mItemList.add(new NewsItem("Title", sampleContent));
        mItemList.add(new NewsItem("Title", sampleContent));
        mItemList.add(new NewsItem("Title", sampleContent));
        mItemList.add(new NewsItem("Title", sampleContent));

        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new ItemListAdapter(this, mItemList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}