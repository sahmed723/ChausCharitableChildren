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
import java.util.ArrayList;



public class addItem extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private TextView time;
    private TextView shortD;
    private Button add;
    private Button cancel;
    private TextView fullD;
    private TextView value;
    private Spinner location;
    private Spinner itemType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additem);

        time = (EditText)findViewById(R.id.tTime);
        shortD = (EditText)findViewById(R.id.txtShort);
        fullD = (EditText)findViewById(R.id.txtFull);
        value = (EditText)findViewById(R.id.txtValue);
        itemType = (Spinner)findViewById(R.id.spItem);
        location = (Spinner)findViewById(R.id.spLocation);
        add = (Button) findViewById(R.id.btnAdd);
        cancel = (Button) findViewById(R.id.btnCancel);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Item,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        itemType.setAdapter(adapter);
        itemType.setOnItemSelectedListener(this);

        location.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item, dashboard.getArray());

        aa.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        location.setAdapter(aa);

        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                item newitem = new item(time.getText().toString(), shortD.getText().toString(),fullD.getText().toString(), value.getText().toString(), itemType.getSelectedItem().toString(),location.getSelectedItem().toString());
                dashboard.itemsList.add(newitem);
                Intent intent2 = new Intent(addItem.this, dashboard.class);
                startActivity(intent2);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
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
