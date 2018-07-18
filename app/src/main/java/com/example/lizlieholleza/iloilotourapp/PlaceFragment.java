package com.example.lizlieholleza.iloilotourapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaceFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.item_list, container, false);
        final ArrayList<Tour> placeList = new ArrayList<Tour>();
        placeList.add(new Tour("Miagao", 19, 2,R.drawable.miagao));
        placeList.add(new Tour("Miagao1", 12, 2,R.drawable.miagao));
        placeList.add(new Tour("Miagao2", 17, 2,R.drawable.miagao));
        placeList.add(new Tour("Miagao3", 18, 2,R.drawable.miagao));
        placeList.add(new Tour("Miagao4", 15, 2,R.drawable.miagao));
        placeList.add(new Tour("Miagao5", 10, 2,R.drawable.miagao));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), placeList);
        ListView lv = (ListView) rootview.findViewById(R.id.item_list);
        lv.setAdapter(adapter);
        return rootview;
    }
}
