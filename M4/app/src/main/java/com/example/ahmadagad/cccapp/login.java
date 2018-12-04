package com.example.ahmadagad.cccapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * main class
 */
public class login extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private TextView message;
    private Button login;
    private Button cancel;
    private static String userType;
    private Button Guest;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
        login = findViewById(R.id.btnLogin);
        Guest = findViewById(R.id.btnGuest);
        cancel = findViewById(R.id.btnCancel);
        message = findViewById(R.id.tvMessage);
        message.setText("Please enter your Username and Password.");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkUser(username.getText().toString(), password.getText().toString());
            }
        });

        Guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDashboard = new Intent(login.this, dashboard.class);

                startActivity(intentDashboard);
            }
        });


        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cancel.setEnabled(true);
                Intent intentCancel = new Intent(login.this, MainActivity.class);
                startActivity(intentCancel);
            }
        });
    }

    private void checkUser(String userName, String userPassword) {
        boolean match = false;

            for (User item : MainActivity.getUsers2()) {
                if (item.get_username().equals(userName)
                        && item.get_password().equals(userPassword)) {
                    count = 0;
                    login.setEnabled(true);
                    userType = item.get_userType();
                    Intent intentDashboard = new Intent(login.this, dashboard.class);
                    match = true;
                    startActivity(intentDashboard);
                }
            }

            if (!match) {
                message.setText("Username or Password is incorrect! Try again.");
                count++;
            }
            if (count >= 3) {
                login.setEnabled(false);
                message.setText("Account is locked");
            }
        }

    /**
     * @return user Type
     */
        public static String getUserType() {
            return userType;
        }
}


