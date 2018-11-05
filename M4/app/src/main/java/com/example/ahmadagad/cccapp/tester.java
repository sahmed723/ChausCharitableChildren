package com.example.ahmadagad.cccapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.ahmadagad.cccapp.dashboard.itemsList;

public class tester extends AppCompatActivity {


        private ListView usList;
        ArrayList<String> nList = new ArrayList<>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_test);



            for (item u: dashboard.itemsList) {
                nList.add(u._shortD);
            }


                    usList = (ListView) findViewById(R.id.test);
                    ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, nList);
                    usList.setAdapter(adapter);



        }
    }

