package com.example.helloworld;
import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btn1 =(Button)findViewById(R.id.Backbutton);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent=new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }

        });

        btn2=findViewById(R.id.skapakontobuttom);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent=new Intent(ProfileActivity.this, Create_account.class);
                startActivity(intent);

            }

        });



    }
}