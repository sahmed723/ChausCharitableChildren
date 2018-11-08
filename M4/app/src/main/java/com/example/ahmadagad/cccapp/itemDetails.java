package com.example.ahmadagad.cccapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * main class
 */
public class itemDetails extends AppCompatActivity {


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_item_information);


        TextView itemLocation = findViewById(R.id.txtLocation);
        TextView itemShort = findViewById(R.id.txtShort);
        TextView itemFull = findViewById(R.id.txtFull);
        TextView itemValue = findViewById(R.id.txtValue);
        TextView itemTime = findViewById(R.id.txtTime);
        TextView itemType = findViewById(R.id.txtType);


            Intent intent = getIntent();
            itemLocation.setText(intent.getStringExtra("location"));
            itemShort.setText("Short Description: " + intent.getStringExtra("short"));
            itemFull.setText("Full Description: " + intent.getStringExtra("full"));
            itemValue.setText("Value: $" + intent.getStringExtra("value"));
            itemTime.setText("Time: " + intent.getStringExtra("time"));
            itemType.setText("Type: " + intent.getStringExtra("type"));




        }
    }

