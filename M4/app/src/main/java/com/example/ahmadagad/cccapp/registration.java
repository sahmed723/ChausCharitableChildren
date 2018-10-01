package com.example.ahmadagad.cccapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Spinner;

public class registration extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button cancel;
    private Button create;
    private EditText username;
    private EditText email;
    private EditText password;
    private Spinner type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        assign();
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.type,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        type.setAdapter(adapter);
        type.setOnItemSelectedListener(this);

        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                cancel.setEnabled(true);
                Intent intent = new Intent(registration.this, MainActivity.class);
                startActivity(intent);
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(registration.this, MainActivity.class));
            }
        });
    }

    private void assign(){
        username = (EditText)findViewById(R.id.etName);
        email = (EditText)findViewById(R.id.etEmail);
        password = (EditText)findViewById(R.id.etPass);
        cancel = (Button)findViewById(R.id.btnCancel);
        create = (Button)findViewById(R.id.btnCreate);
        type = (Spinner)findViewById(R.id.spType);
    }

    private boolean validate(){
        Boolean result = false;
        String name = username.getText().toString();
        String em = email.getText().toString();
        String pass = password.getText().toString();

        if (name.isEmpty() || em.isEmpty() || pass.isEmpty()) {
            Toast.makeText(this,"Please fill in all the information", Toast.LENGTH_SHORT).show();
        } else {
            result = true;
        }
        return result;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
