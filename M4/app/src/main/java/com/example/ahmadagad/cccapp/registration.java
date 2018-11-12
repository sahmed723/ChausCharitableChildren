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
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

//import com.google.firebase.FirebaseApp;

/**
 * main class
 */
public class registration extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button cancel;
    private Button create;
    private EditText username;
    private EditText email;
    private EditText password;
    private TextView mess;
    private Spinner type;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        assign();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.type,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        type.setAdapter(adapter);
        type.setOnItemSelectedListener(this);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cancel.setEnabled(true);
                Intent intent = new Intent(registration.this, MainActivity.class);
                startActivity(intent);
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean check = validate();
                if (!check) {
                    User newUser = new User(username.getText().toString(),
                            password.getText().toString(),
                            type.getSelectedItem().toString(), email.getText().toString());
                    //users.add(newUser);
                    mDatabase.child("User").child(username.getText().toString()).setValue(newUser);
                    mess.setText("User Created!");
                    startActivity(new Intent(registration.this, MainActivity.class));
                }
            }
        });

    }

    private void assign(){
        username = findViewById(R.id.etName);
        email = findViewById(R.id.etEmail);
        password = findViewById(R.id.etPass);
        cancel = findViewById(R.id.btnCancel);
        create = findViewById(R.id.btnCreate);
        type = findViewById(R.id.spType);
        mess = findViewById(R.id.tvMess);

    }

// --Commented out by Inspection START (11/8/18, 12:39 PM):
//    /**
//     * @return list of users
//     */
//    public static ArrayList<User> getUsers () {
//        return MainActivity.users2;
//    }
// --Commented out by Inspection STOP (11/8/18, 12:39 PM)

// --Commented out by Inspection START (11/8/18, 12:39 PM):
    private boolean validate(){
        String name = username.getText().toString();
        String em = email.getText().toString();
        String pass = password.getText().toString();

        if (name.isEmpty() || em.isEmpty() || pass.isEmpty()) {
            mess.setText("Please fill in all the information!");
            return true;
        } else if (!em.contains("@")){
            mess.setText("Email is missing \'@\' symbol!");
            return  true;
        } else if (pass.length() < 5) {
            mess.setText("Password needs to be atleast 5 characters!");
            return true;
        }
        return false;
    }
// --Commented out by Inspection STOP (11/8/18, 12:39 PM)

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
