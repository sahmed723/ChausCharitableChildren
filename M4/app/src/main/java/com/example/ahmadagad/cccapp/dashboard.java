package com.example.ahmadagad.cccapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class dashboard extends AppCompatActivity {

    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        logout = (Button)findViewById(R.id.btnLogout);

        logout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                logout.setEnabled(true);
                Intent intent = new Intent(dashboard.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
