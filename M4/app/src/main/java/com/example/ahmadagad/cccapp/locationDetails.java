package com.example.ahmadagad.cccapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ahmadagad.cccapp.R;

    public class locationDetails extends AppCompatActivity {

        private TextView locationTitle;
        private TextView locationType;
        private TextView locationCoordinates;
        private TextView locationAddress;
        private TextView locationPhone;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_location_information);

            locationTitle = findViewById(R.id.locationNameText);
            locationType = findViewById(R.id.typeText);
            locationCoordinates = findViewById(R.id.coordinatesText);
            locationAddress = findViewById(R.id.addressText);
            locationPhone = findViewById(R.id.phoneText);

            Intent intent = getIntent();
            locationTitle.setText(intent.getStringExtra("name"));
            locationType.setText(intent.getStringExtra("type"));
            locationCoordinates.setText(intent.getStringExtra("coordinates"));
            locationAddress.setText(intent.getStringExtra("address"));
            locationPhone.setText(intent.getStringExtra("phone"));
        }
    }

