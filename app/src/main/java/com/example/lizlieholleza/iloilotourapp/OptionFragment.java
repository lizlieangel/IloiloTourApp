package com.example.lizlieholleza.iloilotourapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class OptionFragment extends FragmentPagerAdapter {
    private Context context;

    public OptionFragment(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return new PlaceFragment();
        } else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return 1;
    }
}
