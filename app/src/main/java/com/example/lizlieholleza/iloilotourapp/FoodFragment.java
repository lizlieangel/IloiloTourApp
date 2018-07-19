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
        food.add(new Tour("Lapaz", "Lapaz Batchoy", "Batchoy is a noodle soup made with pork offal, crushed pork cracklings, chicken stock, beef loin and round noodles.\n" +
                "Its origins can be traced to the district of La Paz, Iloilo City in the Philippines, \n" +
                "hence it is often referred to as La Paz Batchoy", R.drawable.batchoy));
        food.add(new Tour("Iloilo City", "Biscocho Haus", "Biscocho Haus has been serving Ilonggos and tourists visiting the city for more than three decades now. ", R.drawable.biscocho));
        food.add(new Tour("Villa", "Breakthrough", "Extraordinary seafood specialties and a bountiful array of different cuisines anchor an eclectic menu.", R.drawable.breakthrough));
        food.add(new Tour("Lapaz", "Madge", "Madge Café is one of the most jam-packed coffee place in Iloilo City.", R.drawable.madge));
        food.add(new Tour("Iloilo City", "Robertos", "Roberto's siopao might be the perfect pasalubong for your loved ones. ", R.drawable.robertos));
        food.add(new Tour("Villa", "Tatoy's", "If you are into seafood and native Filipino cuisine. ", R.drawable.tatoys));

        FoodAdapter adapter = new FoodAdapter(getActivity(),food);
        ListView lv = (ListView) rootview.findViewById(R.id.item_list);
        lv.setAdapter(adapter);
        return rootview;
    }
}
