package com.tuoren.happywedding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tuoren.refresh.GodRefreshLayout;


public class MainActivity extends AppCompatActivity {

    private GodRefreshLayout refreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        refreshLayout = (GodRefreshLayout) findViewById(R.id.refresh);
        refreshLayout.setRefreshManager();
    }
}
