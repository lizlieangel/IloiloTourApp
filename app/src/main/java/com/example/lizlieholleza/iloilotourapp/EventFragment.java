package com.example.lizlieholleza.iloilotourapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EventFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.item_list,container, false);
        final ArrayList<Tour> events = new ArrayList<Tour>();
        events.add(new Tour("Dinagyang", R.drawable.miagao));
        events.add(new Tour("Dinagyang1", R.drawable.miagao));
        events.add(new Tour("Dinagyang2", R.drawable.miagao));
        events.add(new Tour("Dinagyang3", R.drawable.miagao));
        events.add(new Tour("Dinagyang4", R.drawable.miagao));
        events.add(new Tour("Dinagyang5", R.drawable.miagao));
        events.add(new Tour("Dinagyang6", R.drawable.miagao));
        events.add(new Tour("Dinagyang7", R.drawable.miagao));

        EventAdapter adapter = new EventAdapter(getActivity(),events);
        ListView lv = (ListView) rootview.findViewById(R.id.item_list);
        lv.setAdapter(adapter);
        return rootview;
    }
}
