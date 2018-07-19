package com.example.lizlieholleza.iloilotourapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class OptionAdapter extends FragmentPagerAdapter {
    private Context context;

    public OptionAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return new PlaceFragment();
        } else if(position == 1){
            return new EventFragment();
        } else if(position == 2) {
            return new FoodFragment();
        } else {
            return new LanguageFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.places);
            case 1:
                return context.getString(R.string.events);
            case 2:
                return context.getString(R.string.food);
            case 3:
                return context.getString(R.string.language);
            default:
                return null;
        }
    }
}
