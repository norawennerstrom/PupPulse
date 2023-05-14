package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class profileFragment extends Fragment {

    Button btn1;
    Button btn2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        //setContentView(R.layout.act activity_profile);
        btn1 = view.findViewById(R.id.Backbutton);
        btn1.setOnClickListener(new View.OnClickListener() { // TODO: reset the bottom menu to home when back button is clicked
            @Override
            public void onClick(View v){
                HomeFragment home = new HomeFragment();
                getParentFragmentManager().beginTransaction().replace(R.id.frame_layout, home).commit();
            }

        });

        btn2=view.findViewById(R.id.skapakontobuttom);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getActivity(), Create_account.class);
                startActivity(intent);

            }

        });

        return view;
    }
}