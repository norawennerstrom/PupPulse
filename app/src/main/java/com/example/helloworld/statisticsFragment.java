package com.example.helloworld;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class statisticsFragment extends Fragment {

    ArrayList barArraylist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_statistics, container, false);
        BarChart barChart = view.findViewById(R.id.barchart);
        getData();
        BarDataSet barDataSet = new BarDataSet(barArraylist, getString(R.string.this_week));
        BarData barData = new BarData(barDataSet);
        barChart.setData(barData);
        barDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);
        barChart.getDescription().setEnabled(true);
        return view;
    }

    private void getData() { // TODO: Add labels to each bar in the chart and avoid hard-coding if possible
        barArraylist = new ArrayList();
        barArraylist.add(new BarEntry(2f, 1));
        barArraylist.add(new BarEntry(3f, 3));
        barArraylist.add(new BarEntry(4f, 2));
        barArraylist.add(new BarEntry(5f, 0));
        barArraylist.add(new BarEntry(6f, 5));
    }
}