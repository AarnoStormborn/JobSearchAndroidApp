package com.tutorial.aad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button signIn;
        Intent mainAct;
        EditText username, password;

        signIn = findViewById(R.id.signin);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        mainAct = new Intent(login.this, MainActivity.class);

        String setUsername = "anisha";
        String setPassword = "12345";

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals(setUsername) && password.getText().toString().equals(setPassword)){
                    startActivity(mainAct);
                    finish();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}