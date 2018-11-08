package com.example.ahmadagad.cccapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


/**
 * main class
 */
public class addItem extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private TextView time;
    private TextView shortD;
    private TextView fullD;
    private TextView value;
    private Spinner location;
    private Spinner itemType;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additem);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        time = (EditText)findViewById(R.id.tTime);
        shortD = (EditText)findViewById(R.id.txtShort);
        fullD = (EditText)findViewById(R.id.txtFull);
        value = (EditText)findViewById(R.id.txtValue);
        itemType = findViewById(R.id.spItem);
        location = findViewById(R.id.spLocation);
        Button add = findViewById(R.id.btnAdd);
        Button cancel = findViewById(R.id.btnCancel);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,R.array.Item,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        itemType.setAdapter(adapter);
        itemType.setOnItemSelectedListener(this);

        location.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,
                dashboard.getArray());

        aa.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        location.setAdapter(aa);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item newitem = new item(time.getText().toString(), shortD.getText().toString(),
                        fullD.getText().toString(), value.getText().toString(),
                        itemType.getSelectedItem().toString(),
                        location.getSelectedItem().toString());
                mDatabase.child("Items").child(shortD.getText().toString()).setValue(newitem);
                Intent intent2 = new Intent(addItem.this, dashboard.class);
                startActivity(intent2);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(addItem.this, dashboard.class);
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
