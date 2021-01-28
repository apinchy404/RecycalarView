package com.example.recycalarview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {


    TextView txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        txtName=findViewById(R.id.txt_name);
        String getName=getIntent().getExtras().getString("name");

        txtName.setText(getName);
    }
}