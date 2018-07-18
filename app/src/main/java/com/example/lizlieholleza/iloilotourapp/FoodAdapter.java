package com.example.lizlieholleza.iloilotourapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class FoodAdapter extends ArrayAdapter<Tour> {
    public FoodAdapter( Context context,ArrayList<Tour> food) {
        super(context, 0, food);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.food_details,parent, false);
        }
        Tour currentFood = getItem(position);
        ImageView image = (ImageView) listItemView.findViewById(R.id.food_image);
        image.setImageResource(currentFood.getImageID());
        TextView food_name = (TextView) listItemView.findViewById(R.id.food_name);
        food_name.setText(currentFood.getFood());
        TextView food_loc = (TextView) listItemView.findViewById(R.id.food_loc);
        food_loc.setText(currentFood.getName());
        return listItemView;
    }
}
