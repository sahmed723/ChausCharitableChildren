package com.example.ahmadagad.cccapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.ahmadagad.cccapp.Models.Location;

import java.util.ArrayList;

import static com.example.ahmadagad.cccapp.dashboard.itemsList;


public class results extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private ListView itemList3;
    private String locat;
    private String cata;
    private String nam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        locat = search.loc;
        cata = search.cat;
        nam = search.name;

        ArrayList<item> newList = new ArrayList<>();

        for (item i: itemsList) {
            newList.add(i);
        }

        ArrayList<item> mainList = new ArrayList<>();
        ArrayList<String> sideList = new ArrayList<>();

        if (locat.equals("Location Name: All Locations")) {
            for(item i: newList) {
                sideList.add(i._shortD);
                mainList.add(i);
            }
        } else {
            for(item i: newList) {
                if (i._location.equals(locat)) {
                    sideList.add(i._shortD);
                    mainList.add(i);
                }
            }
        }

        newList = new ArrayList<>();

        for (item i: mainList) {
            newList.add(i);
        }

        mainList = new ArrayList<>();
        sideList = new ArrayList<>();


        if (cata.equals("All Items")) {
            for(item i: newList) {
                sideList.add(i._shortD);
                mainList.add(i);
            }
        } else {
            for(item i: newList) {
                if (i._itemType.equals(cata)) {
                    sideList.add(i._shortD);
                    mainList.add(i);
                }
            }
        }


        newList = new ArrayList<>();

        for (item i: mainList) {
            newList.add(i);
        }

        mainList = new ArrayList<>();
        sideList = new ArrayList<>();


        if (nam.isEmpty()) {
            for(item i: newList) {
                sideList.add(i._shortD);
                mainList.add(i);
            }
        } else {
            for(item i: newList) {
                if (i._shortD.contains(nam)) {
                    sideList.add(i._shortD);
                    mainList.add(i);
                }
            }
        }


        itemList3 = (ListView) findViewById(R.id.lvitemList);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, sideList);
        itemList3.setAdapter(adapter);



        final ArrayList<item> finalMainList = mainList;
        itemList3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent32 = new Intent(getApplicationContext(), itemDetails.class);
                intent32.putExtra("location", finalMainList.get(position)._location);
                intent32.putExtra("short", finalMainList.get(position)._shortD);
                intent32.putExtra("full", finalMainList.get(position)._fullD);
                intent32.putExtra("type", finalMainList.get(position)._itemType);
                intent32.putExtra("time", finalMainList.get(position)._time);
                intent32.putExtra("value", finalMainList.get(position)._value);


                startActivity(intent32);
            }
        });

        if (sideList.isEmpty()) {
            Toast.makeText(this,"No items found.", Toast.LENGTH_SHORT).show();
        }



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
