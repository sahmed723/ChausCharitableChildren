package com.example.ahmadagad.cccapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

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
    public View getView(int position, View convertView, ViewGroup parent) {
        String name = getItem(position).getName();
        String city = getItem(position).getCity();
        String address = getItem(position).getStreetAddress();
        String zip = getItem(position).getZip();
        String state = getItem(position).getState();

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