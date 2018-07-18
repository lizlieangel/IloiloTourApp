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

public class LanguageFragment extends Fragment {
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.item_list, container, false);
        final ArrayList<Tour> language = new ArrayList<Tour>();
        language.add(new Tour("Beautiful1", "Gwapa", R.raw.family_older_sister, R.drawable.miagao));
        language.add(new Tour("Beautiful2", "Gwapa", R.raw.family_older_sister, R.drawable.miagao));
        language.add(new Tour("Beautiful3", "Gwapa", R.raw.family_older_sister, R.drawable.miagao));
        language.add(new Tour("Beautiful4", "Gwapa", R.raw.family_older_sister, R.drawable.miagao));
        language.add(new Tour("Beautiful5", "Gwapa", R.raw.family_older_sister, R.drawable.miagao));
        language.add(new Tour("Beautiful6", "Gwapa", R.raw.family_older_sister, R.drawable.miagao));
        language.add(new Tour("Beautiful7", "Gwapa", R.raw.family_older_sister, R.drawable.miagao));
        language.add(new Tour("Beautiful8", "Gwapa", R.raw.family_older_sister, R.drawable.miagao));

        LanguageAdapter adapter = new LanguageAdapter(getActivity(), language);
        ListView lv = (ListView) rootview.findViewById(R.id.item_list);
        lv.setAdapter(adapter);
    }
}
