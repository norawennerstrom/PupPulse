package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNextBtnClick (View view) { //TODO: Make it possible to log in to/create an account
        EditText edtTxtEmail = findViewById(R.id.enterEmail);
        EditText edtTxtPassword = findViewById(R.id.enterPassword);
        String userEmail = edtTxtEmail.getText().toString();
        String userPassword = edtTxtPassword.getText().toString();

    }
}