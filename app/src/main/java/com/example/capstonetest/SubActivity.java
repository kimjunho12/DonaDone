package com.example.capstonetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SubActivity extends AppCompatActivity {

    private ListView list;

    private TextView tv_sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub = findViewById(R.id.tv_sub);
        list = (ListView)findViewById(R.id.list);
        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter);

        data.add("Hello World!!!!!!!!!!!");
        data.add("Android!!");
        adapter.notifyDataSetChanged(); // 현재 추가 상황 저장

        Intent intent = getIntent();
        String str = intent.getStringExtra("str");

        tv_sub.setText(str);

    }
}