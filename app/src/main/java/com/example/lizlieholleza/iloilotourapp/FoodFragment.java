package com.example.lizlieholleza.iloilotourapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class FoodFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.item_list, container, false);
        final ArrayList<Tour> food = new ArrayList<Tour>();
        food.add(new Tour("Miagao1", "Ginamos1", namit gid ya dan, plus epares sa manga", R.drawable.miagao));
        food.add(new Tour("Miagao2", "Ginamos2", namit gid ya dan, plus epares sa manga", R.drawable.miagao));
        food.add(new Tour("Miagao3", "Ginamos3", namit gid ya dan, plus epares sa manga", R.drawable.miagao));
        food.add(new Tour("Miagao4", "Ginamos4", namit gid ya dan, plus epares sa manga", R.drawable.miagao));
        food.add(new Tour("Miagao5", "Ginamos5", namit gid ya dan, plus epares sa manga", R.drawable.miagao));
        food.add(new Tour("Miagao6", "Ginamos6", namit gid ya dan, plus epares sa manga", R.drawable.miagao));
        food.add(new Tour("Miagao7", "Ginamos7", namit gid ya dan, plus epares sa manga", R.drawable.miagao));
        food.add(new Tour("Miagao8", "Ginamos8", namit gid ya dan, plus epares sa manga", R.drawable.miagao));

        FoodAdapter adapter = new FoodAdapter(getActivity(),food);
        ListView lv = (ListView) rootview.findViewById(R.id.item_list);
        lv.setAdapter(adapter);
        return rootview;
    }
}
