package com.example.tatianka.task2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // set toolbar
        if(getSupportActionBar()!=null) {
            getSupportActionBar().setTitle(R.string.issue_id);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new ImageAdapter(getResources().getStringArray(R.array.imageURLs), this);
        recyclerView.setAdapter(adapter);

    }

    public void onViewClick(View v){
        String strMessage = v.getClass().getSimpleName();
        Toast.makeText(this, strMessage, Toast.LENGTH_SHORT).show();
    }
}

