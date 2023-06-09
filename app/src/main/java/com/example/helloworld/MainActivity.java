package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    // Notifications

    private static final String channel_id = "channel_id";
    private static final String channel_name = "channel_name";
    private static final String channel_description = "channel_desc";


    // Bottom menu
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
                    //case R.id.notifications_menu_item:
                    //    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, notifications).commit();
                    //    return true;
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

    }

    private void displayNotification() { // TODO: fix this function or remove it (along with the strings at the top)
        //NotificationCompat.Builder nBuilder = new NotificationCompat.Builder(this, channel_id).setSmallIcon();
    }

}