package com.example.helloworld;

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

        btn4 =(Button)findViewById(R.id.button2);
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    Intent intent=new Intent(Create_account.this, Profil_with_account.class);
                    startActivity(intent);
                }

            });

        }
}





