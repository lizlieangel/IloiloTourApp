package com.example.lizlieholleza.iloilotourapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaceFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.item_list, container, false);
        final ArrayList<Tour> placeList = new ArrayList<Tour>();
        placeList.add(new Tour("Miagao", 19, 2,R.drawable.miagao));
        placeList.add(new Tour("Cabatuan", 12, 2,R.drawable.cabatuan));
        placeList.add(new Tour("Tubungan", 17, 2,R.drawable.tubungan));
        placeList.add(new Tour("Jaro", 18, 2,R.drawable.jaro));
        placeList.add(new Tour("Lambunao", 15, 2,R.drawable.lambunao));
        placeList.add(new Tour("Molo", 10, 2,R.drawable.molo));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), placeList);
        ListView lv = (ListView) rootview.findViewById(R.id.item_list);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(getActivity(), com.example.lizlieholleza.iloilotourapp.PlaceActivity.class);
                    intent.putExtra("pInfo_image", placeList.get(i).getImageID());
                    intent.putExtra("pInfo_place", placeList.get(i).getName());
                    intent.putExtra("pInfo_distance", "Distance: " + placeList.get(i).getDistance() + " km");
                    intent.putExtra("pInfo_time", "Travel time: " + placeList.get(i).getTime() + " hrs");
                    startActivity(intent);
            }
        });
        return rootview;
    }
}
