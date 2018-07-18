package com.example.lizlieholleza.iloilotourapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class LanguageFragment extends Fragment {
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.item_list, container, false);
        final ArrayList<Tour> language = new ArrayList<Tour>();
        language.add(new Tour("Beautiful", "Gwapa", ))
    }
}
