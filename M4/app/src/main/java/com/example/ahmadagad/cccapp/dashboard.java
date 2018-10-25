package com.example.ahmadagad.cccapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.ahmadagad.cccapp.Models.Location;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;


public class dashboard extends AppCompatActivity {


    private Button logout;
    private Button add;
    private static ArrayList<Location> locations;
    private ListView locationList;
    private String currentUser;
    public static ArrayList<item> itemsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        currentUser = login.getUserType();

        logout = (Button)findViewById(R.id.btnLogout);

        logout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                logout.setEnabled(true);
                Intent intent = new Intent(dashboard.this, MainActivity.class);
                startActivity(intent);
            }
        });

        add = (Button)findViewById(R.id.btnaddItem);
        add.setEnabled(false);
        if(currentUser.equals("Location Employee")) {
            add.setEnabled(true);
        }

        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent2 = new Intent(dashboard.this, addItem.class);
                startActivity(intent2);
            }
        });

        locations = new ArrayList<>();

        getLocationData();

        locationList = findViewById(R.id.locationList);
        LocationListAdapter adapter = new LocationListAdapter(this, R.layout.layout_item_list, locations);
        locationList.setAdapter(adapter);

        locationList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent3 = new Intent(getApplicationContext(), locationDetails.class);
                intent3.putExtra("name", locations.get(position).getName());
                intent3.putExtra("type", locations.get(position).getType());
                intent3.putExtra("address", "Address: " + locations.get(position).
                        getStreetAddress() + ", " + locations.get(position).getCity() + ", " +
                        locations.get(position).getZip());
                intent3.putExtra("phone", "Phone: " + locations.get(position).getPhoneNumber());
                intent3.putExtra("coordinates", "Coordinates: (" + Double.toString(
                        locations.get(position).getLatitude()) + ", " + Double.toString(
                        locations.get(position).getLongitude()) + ")");
                startActivity(intent3);
            }
        });
    }
    public static ArrayList<Location> getArray() {
        return locations;
    }
//    public static ArrayList<item> getItemsList() {
//        return itemsList;
//    }
    private void getLocationData() {
        InputStream instream = getResources().openRawResource(R.raw.locationdata);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(instream, Charset.forName("UTF-8")));
        String ln;
        try {
            reader.readLine();
            while ((ln = reader.readLine()) != null) {
                String[] tokens = ln.split(",");
                Location location = new Location();
                location.setKey(Integer.parseInt(tokens[0]));
                location.setName(tokens[1]);
                location.setLatitude(Double.parseDouble(tokens[2]));
                location.setLongitude(Double.parseDouble(tokens[3]));
                location.setStreetAddress(tokens[4]);
                location.setCity(tokens[5]);
                location.setState(tokens[6]);
                location.setZip(tokens[7]);
                location.setType(tokens[8]);
                location.setPhoneNumber(tokens[9]);
                location.setWebsite(tokens[10]);
                locations.add(location);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
