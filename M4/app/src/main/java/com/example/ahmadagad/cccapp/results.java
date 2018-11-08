package com.example.ahmadagad.cccapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//import static com.example.ahmadagad.cccapp.dashboard.itemsList;


/**
 * main class
 */
public class results extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        String locat = search.getLoc();
        String cata = search.getCat();
        String nam = search.getName();

        Collection<item> newList = new ArrayList<>();

        newList.addAll(dashboard.getItemsList());

        List<item> mainList = new ArrayList<>();
        ArrayList<String> sideList = new ArrayList<>();

        if ("Location Name: All Locations".equals(locat)) {
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

        newList.addAll(mainList);

        mainList = new ArrayList<>();
        sideList = new ArrayList<>();


        if ("All Items".equals(cata)) {
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

        newList.addAll(mainList);

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


        ListView itemList3 = findViewById(R.id.lvitemList);
        ListAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                sideList);
        itemList3.setAdapter(adapter);



        final List<item> finalMainList = mainList;
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
