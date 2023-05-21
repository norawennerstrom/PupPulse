package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class AltCreate_account extends AppCompatActivity {
    Button btnAdd;
    EditText name = findViewById(R.id.edtTxtAccName);
    EditText dogName = findViewById(R.id.edtTxtAccDogName);
    EditText dogAge = findViewById(R.id.edtTxtAccAge);
    EditText dogWeight = findViewById(R.id.edtTxtAccWeight);
    EditText dogBreed = findViewById(R.id.edtTxtAccBreed);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account3);

        btnAdd =(Button)findViewById(R.id.btnAddDog);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String inputName = name.getText().toString();
                String inputDogName = dogName.getText().toString();
                String inputDogAge = dogAge.getText().toString();
                String inputDogWeight = dogWeight.getText().toString();
                String inputDogBreed = dogBreed.getText().toString();

                Intent intent = new Intent(AltCreate_account.this, SettingsActivity.class);

                intent.putExtra("userInputName", inputName);
                intent.putExtra("userInputDogName", inputDogName);
                intent.putExtra("userInputDogAge", inputDogAge);
                intent.putExtra("userInputDogWeight", inputDogWeight);
                intent.putExtra("userInputDogBreed", inputDogBreed);

                Toast.makeText(AltCreate_account.this, "Dog Added!", Toast.LENGTH_SHORT).show();


            }

        });

    }
}





