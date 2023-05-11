package com.example.helloworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    //ActivityMainBinding binding;
    BottomNavigationView bottomNavigationView;
    HomeFragment home = new HomeFragment();
    notificationsFragment notifications = new notificationsFragment();
    profileFragment profile = new profileFragment();
    statisticsFragment statistics = new statisticsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, home).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.home_menu_item:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, home).commit();
                        return true;
                    case R.id.notifications_menu_item:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, notifications).commit();
                        return true;
                    case R.id.profile_menu_item:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, profile).commit();
                        return true;
                    case R.id.statistics_menu_item:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, statistics).commit();
                        return true;
                }
                return false;
            }
        });

        //binding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());
        //replaceFragment(new HomeFragment());

        //binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            //switch (item.getItemId()) {
           //     case R.id.home_menu_item:
           //         replaceFragment(new HomeFragment());
           //         break;
           //     case R.id.profile_menu_item:
           //         replaceFragment(new profileFragment());
           //         break;
           //     case R.id.statistics_menu_item:
           //         replaceFragment(new statisticsFragment());
           //         break;
           //     case R.id.notifications_menu_item:
           //         replaceFragment(new notificationsFragment());
           //         break;
            //}

        //    return true;
        //});

    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}