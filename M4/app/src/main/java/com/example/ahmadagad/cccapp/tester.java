package com.example.ahmadagad.cccapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * main class
 */
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
                    ListAdapter adapter = new ArrayAdapter(this,
                            android.R.layout.simple_list_item_1, nList);
                    usList.setAdapter(adapter);



        }
    }

