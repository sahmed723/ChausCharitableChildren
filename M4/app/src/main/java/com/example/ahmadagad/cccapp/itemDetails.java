package com.example.ahmadagad.cccapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * main class
 */
public class itemDetails extends AppCompatActivity {

        private TextView itemLocation;
        private TextView itemShort;
        private TextView itemFull;
        private TextView itemValue;
        private TextView itemTime;
        private TextView itemType;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_item_information);


            itemLocation = findViewById(R.id.txtLocation);
            itemShort = findViewById(R.id.txtShort);
            itemFull = findViewById(R.id.txtFull);
            itemValue = findViewById(R.id.txtValue);
            itemTime = findViewById(R.id.txtTime);
            itemType = findViewById(R.id.txtType);


            Intent intent = getIntent();
            itemLocation.setText(intent.getStringExtra("location"));
            itemShort.setText("Short Description: " + intent.getStringExtra("short"));
            itemFull.setText("Full Description: " + intent.getStringExtra("full"));
            itemValue.setText("Value: $" + intent.getStringExtra("value"));
            itemTime.setText("Time: " + intent.getStringExtra("time"));
            itemType.setText("Type: " + intent.getStringExtra("type"));




        }
    }

