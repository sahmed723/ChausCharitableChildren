package com.example.ahmadagad.cccapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registration extends AppCompatActivity {

    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        back = (Button)findViewById(R.id.btnBack);

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                back.setEnabled(true);
                Intent intent = new Intent(registration.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
