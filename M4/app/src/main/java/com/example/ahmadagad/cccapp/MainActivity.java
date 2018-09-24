package com.example.ahmadagad.cccapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private Button registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button)findViewById(R.id.btnLogin);
        registration = (Button)findViewById(R.id.btnRegistration);

        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                login.setEnabled(true);
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
            }
        });

        registration.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                registration.setEnabled(true);
                Intent intent = new Intent(MainActivity.this, registration.class);
                startActivity(intent);
            }
        });
    }
}
