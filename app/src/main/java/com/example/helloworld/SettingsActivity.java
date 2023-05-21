package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    Switch darkModeSw;
    TextView viewYourName, viewDogName, viewDogAge, viewDogWeight, viewDogBreed, viewDarkMode, viewSettings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        darkModeSw = findViewById(R.id.darkModeSwitch);
        viewYourName= findViewById(R.id.textView8);
        viewDogName = findViewById(R.id.textView9);
        viewDogAge = findViewById(R.id.textView10);
        viewDogWeight = findViewById(R.id.textView11);
        viewDogBreed = findViewById(R.id.textView12);
        viewDarkMode = findViewById(R.id.darkModeSwitch);
        viewSettings = findViewById(R.id.txtViewSet);


        String inputName = getIntent().getStringExtra("userInputName");
        String inputDogName = getIntent().getStringExtra("userInputDogName");
        String inputDogAge = getIntent().getStringExtra("userInputDogAge");
        String inputDogWeight = getIntent().getStringExtra("userInputDogWeight");
        String inputDogBreed = getIntent().getStringExtra("userInputDogBreed");

        EditText txtName = findViewById(R.id.edtTxtName);
        txtName.setText(inputName);
        EditText txtDogName = findViewById(R.id.edtTxtDogName);
        txtDogName.setText(inputDogName);
        EditText txtDogAge = findViewById(R.id.edtTxtDogAge);
        txtDogAge.setText(inputDogAge);
        EditText txtDogWeight = findViewById(R.id.edtTxtDogWeight);
        txtDogWeight.setText(inputDogWeight);
        EditText txtDogBreed = findViewById(R.id.edtTxtBreed);
        txtDogBreed.setText(inputDogBreed);

        darkModeSw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    viewYourName.setTextColor(Color.WHITE);
                    viewDogName.setTextColor(Color.WHITE);
                    viewDogAge.setTextColor(Color.WHITE);
                    viewDogWeight.setTextColor(Color.WHITE);
                    viewDogBreed.setTextColor(Color.WHITE);
                    txtName.setTextColor(Color.WHITE);
                    txtDogName.setTextColor(Color.WHITE);
                    txtDogAge.setTextColor(Color.WHITE);
                    txtDogWeight.setTextColor(Color.WHITE);
                    txtDogBreed.setTextColor(Color.WHITE);
                    viewDarkMode.setTextColor(Color.WHITE);
                    viewSettings.setTextColor(Color.WHITE);

                    getWindow().getDecorView().setBackgroundColor(Color.BLACK);
                } else {
                    viewYourName.setTextColor(Color.BLACK);
                    viewDogName.setTextColor(Color.BLACK);
                    viewDogAge.setTextColor(Color.BLACK);
                    viewDogWeight.setTextColor(Color.BLACK);
                    viewDogBreed.setTextColor(Color.BLACK);
                    txtName.setTextColor(Color.BLACK);
                    txtDogName.setTextColor(Color.BLACK);
                    txtDogAge.setTextColor(Color.BLACK);
                    txtDogWeight.setTextColor(Color.BLACK);
                    txtDogBreed.setTextColor(Color.BLACK);
                    viewDarkMode.setTextColor(Color.BLACK);
                    viewSettings.setTextColor(Color.BLACK);

                    getWindow().getDecorView().setBackgroundColor(Color.WHITE);
                }
            }
        });

    }

    public void onDeleteBtnClick (View view) {



    }
}