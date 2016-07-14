package com.learn.ocean.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String [] forcastData = {
                "Today - Sunny - 31/13",
                "Tomorrow - Foggy - 30/13",
                "Saturday - Rainy - 24/12",
                "Sunday - Cloudy - 25/12"
        };
        List<String> weekForecast = new ArrayList<>(Arrays.asList(forcastData));
        ArrayAdapter<String> forecastAdapter = new ArrayAdapter<>(getActivity(),
                R.layout.list_item_forcast,
                R.id.list_item_forecast_textView,
                weekForecast);
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.listView_forecast);
        listView.setAdapter(forecastAdapter);
        return rootView;
    }
}
