/*package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Create_account extends AppCompatActivity {
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account2);

        btn4 =(Button)findViewById(R.id.btnAddDog);
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    Intent intent=new Intent(Create_account.this, Profil_with_account.class);
                    startActivity(intent);
                }

            });

        }
}
*/

package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Create_account extends AppCompatActivity {
    Button btnAdd;
    EditText name;
    EditText dogName;
    EditText dogAge;
    EditText dogWeight;
    EditText dogBreed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account3);

        btnAdd =(Button)findViewById(R.id.btnAddDog);
        name = findViewById(R.id.edtTxtAccName);
        dogName = findViewById(R.id.edtTxtAccDogName);
        dogAge = findViewById(R.id.edtTxtAccAge);
        dogWeight = findViewById(R.id.edtTxtAccWeight);
        dogBreed = findViewById(R.id.edtTxtAccBreed);



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String inputName = name.getText().toString();
                String inputDogName = dogName.getText().toString();
                String inputDogAge = dogAge.getText().toString();
                String inputDogWeight = dogWeight.getText().toString();
                String inputDogBreed = dogBreed.getText().toString();

                Intent intent = new Intent(Create_account.this, SettingsActivity.class);

                intent.putExtra("userInputName", inputName);
                intent.putExtra("userInputDogName", inputDogName);
                intent.putExtra("userInputDogAge", inputDogAge);
                intent.putExtra("userInputDogWeight", inputDogWeight);
                intent.putExtra("userInputDogBreed", inputDogBreed);

                Toast.makeText(Create_account.this, "Dog Added!", Toast.LENGTH_SHORT).show();

            startActivity(intent);
            }

        });

    }
}










