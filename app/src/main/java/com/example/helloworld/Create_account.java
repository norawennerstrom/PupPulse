package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class Create_account extends AppCompatActivity
{

    String [] items = {"Alder", "1", "2", "3", "4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21"};
    String [] weight= {"weight","2","3","4","5","10","15","20","25","30","35","40","45","50","55","60","65","70","75","70"};

    AutoCompleteTextView autoCompleteTextView;
    AutoCompleteTextView autoCompleteTextView6;

    ArrayAdapter<String> adapterItems;
    ArrayAdapter<String> adapterweight;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account2);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        adapterItems=new ArrayAdapter<>(this, R.layout.dropdown_item,items);
        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String items=parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "items:" +items,Toast.LENGTH_SHORT).show();          }
        });


    }

}


