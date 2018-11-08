package com.example.ahmadagad.cccapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.ahmadagad.cccapp.Models.Location;

import java.util.ArrayList;


/**
 * main class
 */
public class search extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    private Spinner location;
    private Spinner itemType;
    private EditText itemName;
    private static String loc;
    private static String cat;
    private static String name;

    /**
     * @return getter for location
     */
    public static String getLoc() {
        return loc;
    }

    /**
     * @return getter for category
     */
    public static String getCat() {
        return cat;
    }

    /**
     * @return getter for name
     */
    public static String getName() {
        return name;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        itemName = findViewById(R.id.txtItemName);
        itemType = findViewById(R.id.spItem);
        location = findViewById(R.id.spLocation);
        Button find = findViewById(R.id.btnFind);
        Button cancel = findViewById(R.id.btnCancel);



        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Item2,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        itemType.setAdapter(adapter);
        itemType.setOnItemSelectedListener(this);

        location.setOnItemSelectedListener(this);
        Location allLocation = new Location();
        allLocation.setName("All Locations");
        ArrayList<Location> newArray = dashboard.getArray();
        newArray.add(0, allLocation);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item, newArray);

        aa.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        location.setAdapter(aa);

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loc = location.getSelectedItem().toString();
                cat = itemType.getSelectedItem().toString();
                name = itemName.getText().toString();
                Intent intent2 = new Intent(search.this, results.class);
                startActivity(intent2);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(search.this, dashboard.class);
                startActivity(intent2);
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
