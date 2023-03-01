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

        LinkedList<String> mItemList = new LinkedList<>();
        mItemList.add("NIGGER");
        mItemList.add("FAGGOT");
        mItemList.add("HUH");
        mItemList.add("HAH");
        mItemList.add("NONONONO");
        mItemList.add("KINOKINOKINOKINO");
        mItemList.add("KYSKYSKYKSKYS");

        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new ItemListAdapter(this, mItemList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}