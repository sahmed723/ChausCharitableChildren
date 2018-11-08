package com.example.ahmadagad.cccapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;

import com.example.ahmadagad.cccapp.Models.Location;

/**
 * main class
 */
class LocationListAdapter extends ArrayAdapter<Location> {
    private final Context mContext;
    private final int mResource;


    /**
     * @param context of viewmodel
     * @param resource of veiwmodel
     * @param objects of viewmodel
     */
    public LocationListAdapter(@NonNull Context context, int resource, List<Location> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        String name = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
            name = Objects.requireNonNull(getItem(position)).getName();
        }
        String city = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
            city = Objects.requireNonNull(getItem(position)).getCity();
        }
        String address = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
            address = Objects.requireNonNull(getItem(position)).getStreetAddress();
        }
        String zip = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
            zip = Objects.requireNonNull(getItem(position)).getZip();
        }
        String state = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
            state = Objects.requireNonNull(getItem(position)).getState();
        }

        String total = String.format("%s, %s, %s %s", address, city, state, zip);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View convertView1 = inflater.inflate(mResource, parent, false);

        TextView nameView = convertView1.findViewById(R.id.locationName);
        TextView addressView = convertView1.findViewById(R.id.locationAddress);
        nameView.setText(name);
        addressView.setText(total);
        return convertView1;
    }
}