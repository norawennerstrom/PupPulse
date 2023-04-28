package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtLogIn = findViewById(R.id.logIn);
        EditText edtTxtEmail = findViewById(R.id.enterEmail);
        EditText edtTxtPassword = findViewById(R.id.enterPassword);
        String userEmail = edtTxtEmail.getText().toString();

        //TODO: Commit and push after writing code

    }
}