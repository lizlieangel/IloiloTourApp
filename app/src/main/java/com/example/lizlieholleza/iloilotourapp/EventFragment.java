package com.example.lizlieholleza.iloilotourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class EventFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.item_list,container, false);
        final ArrayList<Tour> events = new ArrayList<Tour>();
        events.add(new Tour("Dinagyang", R.drawable.dinagyang));
        events.add(new Tour("Bucari", R.drawable.bucari));
        events.add(new Tour("Chess Tournament", R.drawable.chess));
        events.add(new Tour("Garin Farm", R.drawable.garin_farm));
        events.add(new Tour("Paraw Regatta", R.drawable.paraw_regatta));
        events.add(new Tour("Sheridan Resort", R.drawable.resort));
        events.add(new Tour("Museo de Iloilo", R.drawable.museum));
        events.add(new Tour("Damires Resort", R.drawable.damires));

        EventAdapter adapter = new EventAdapter(getActivity(),events, R.color.colorAccent);
        ListView lv = (ListView) rootview.findViewById(R.id.item_list);
        lv.setAdapter(adapter);
        return rootview;
    }
}
