package com.example.ahmadagad.cccapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class login extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private TextView message;
    private Button login;
    private Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        //contents of login page
        username = (EditText)findViewById(R.id.etUsername);
        password = (EditText)findViewById(R.id.etPassword);
        login = (Button)findViewById(R.id.btnLogin);
        cancel = (Button)findViewById(R.id.btnCancel);
        message = (TextView)findViewById(R.id.tvMessage);
        message.setText("Please enter your Username and Password.");

        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                checkUser(username.getText().toString(), password.getText().toString());
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                cancel.setEnabled(true);
                Intent intentCancel = new Intent(login.this, MainActivity.class);
                startActivity(intentCancel);
            }
        });
    }

    private void checkUser(String userName, String userPassword) {

        if (userName.equals("user") && userPassword.equals("pass")) {
            login.setEnabled(true);
            Intent intentDashboard = new Intent(login.this, dashboard.class);
            startActivity(intentDashboard);
        } else if (userName.equals("user") && !userPassword.equals("pass")) {
            message.setText("Password is incorrect! Try again.");

        } else if (!userName.equals("user") && userPassword.equals("pass")) {
            message.setText("Username is incorrect! Try again.");
        } else {
            message.setText("Username and Password is incorrect! Try again.");
        }
    }
}

