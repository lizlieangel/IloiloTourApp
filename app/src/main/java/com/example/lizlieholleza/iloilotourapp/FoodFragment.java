package com.example.lizlieholleza.iloilotourapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FoodFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.item_list, container, false);
        final ArrayList<Tour> food = new ArrayList<Tour>();
        food.add(new Tour("Miagao", "Ginamos", R.drawable.miagao));
        food.add(new Tour("Miagao", "Ginamos", R.drawable.miagao));
        food.add(new Tour("Miagao", "Ginamos", R.drawable.miagao));
        food.add(new Tour("Miagao", "Ginamos", R.drawable.miagao));
        food.add(new Tour("Miagao", "Ginamos", R.drawable.miagao));
        food.add(new Tour("Miagao", "Ginamos", R.drawable.miagao));
        food.add(new Tour("Miagao", "Ginamos", R.drawable.miagao));
        food.add(new Tour("Miagao", "Ginamos", R.drawable.miagao));



    }
}
