package com.example.helloworld;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    TextView currentPulseTextView;
    int currentPulse;
    int highPulse = 120; // Depends on dog's breed and age!
    int lowPulse = 70;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        currentPulseTextView = view.findViewById(R.id.currentPulse);
        currentPulse = 95; // TODO: create a function that would be used to retrieve the actual pulse from the heart rate monitor
        currentPulseTextView.setText(String.valueOf(currentPulse));
        if(currentPulse > highPulse) {
            currentPulseTextView.setTextColor(ContextCompat.getColor(getContext(), R.color.red));
        } else if(currentPulse > lowPulse) {
            currentPulseTextView.setTextColor(ContextCompat.getColor(getContext(), R.color.green));
        } else if(currentPulse < lowPulse) {
            currentPulseTextView.setTextColor(ContextCompat.getColor(getContext(), R.color.blue));
        }
        return view;
    }
}