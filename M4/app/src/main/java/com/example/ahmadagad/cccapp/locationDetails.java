package com.example.ahmadagad.cccapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.ahmadagad.cccapp.dashboard.itemsList;

/**
 * main class
 */
public class locationDetails extends AppCompatActivity {

        private TextView locationTitle;
        private TextView locationType;
        private TextView locationCoordinates;
        private TextView locationAddress;
        private TextView locationPhone;
        private ListView itemList2;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_location_information);


            locationTitle = findViewById(R.id.locationNameText);
            locationType = findViewById(R.id.txtShort);
            locationCoordinates = findViewById(R.id.txtValue);
            locationAddress = findViewById(R.id.txtFull);
            locationPhone = findViewById(R.id.phoneText);


            Intent intent = getIntent();
            locationTitle.setText(intent.getStringExtra("name"));
            locationType.setText(intent.getStringExtra("type"));
            locationCoordinates.setText(intent.getStringExtra("coordinates"));
            locationAddress.setText(intent.getStringExtra("address"));
            locationPhone.setText(intent.getStringExtra("phone"));

            Iterable<item> newArray = itemsList;
            ArrayList<String> mainArray = new ArrayList<>();
            final List<item> sideArray = new ArrayList<>();

            for(item i: newArray) {
                if (i._location.equals("Location Name: " + locationTitle.getText().toString())) {
                    mainArray.add(i._shortD);
                    sideArray.add(i);

                }
            }

                    itemList2 = (ListView) findViewById(R.id.itemList);
                    ListAdapter adapter = new ArrayAdapter(this,
                            android.R.layout.simple_list_item_1, mainArray);
                    itemList2.setAdapter(adapter);

            itemList2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent3 = new Intent(getApplicationContext(), itemDetails.class);
                    intent3.putExtra("location", sideArray.get(position)._location);
                    intent3.putExtra("short", sideArray.get(position)._shortD);
                    intent3.putExtra("full", sideArray.get(position)._fullD);
                    intent3.putExtra("type", sideArray.get(position)._itemType);
                    intent3.putExtra("time", sideArray.get(position)._time);
                    intent3.putExtra("value", sideArray.get(position)._value);


                    startActivity(intent3);
                }
            });


        }


    }

