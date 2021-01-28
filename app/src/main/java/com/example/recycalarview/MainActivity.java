package com.example.recycalarview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    String countryList[]={"Bangladesh","India","China","Australia","America","New Zealand","Portugal"};
    int imgList[]={R.drawable.bd,R.drawable.india,R.drawable.china,R.drawable.australia,R.drawable.america,R.drawable.new_zealand,R.drawable.portugle};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager( MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);


        Adapter adapter= new Adapter(MainActivity.this,countryList,imgList);
        recyclerView.setAdapter(adapter);

    }
}