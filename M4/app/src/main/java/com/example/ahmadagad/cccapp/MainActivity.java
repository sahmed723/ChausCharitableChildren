package com.example.ahmadagad.cccapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * main classs
 */
public class MainActivity extends AppCompatActivity {

    private Button login;
    private Button registration;
    private static List<User> users2;

    /**
     * @return getter for user
     */
    public static Iterable<User> getUsers2() {
        return Collections.unmodifiableList(users2);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DatabaseReference mData = FirebaseDatabase.getInstance().getReference("User");

        login = findViewById(R.id.btnLogin);
        registration = findViewById(R.id.btnRegistration);
        mData.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                users2 = new ArrayList<>();
                for (DataSnapshot userSnapshot: dataSnapshot.getChildren()) {
                    User nUser2 = userSnapshot.getValue(User.class);
                    users2.add(nUser2);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });




        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login.setEnabled(true);
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
            }
        });

        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registration.setEnabled(true);
                Intent intent = new Intent(MainActivity.this, registration.class);
                startActivity(intent);
            }
        });
    }



}
