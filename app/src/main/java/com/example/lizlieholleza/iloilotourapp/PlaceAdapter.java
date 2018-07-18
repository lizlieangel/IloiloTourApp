package com.example.lizlieholleza.iloilotourapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class PlaceAdapter extends ArrayAdapter<Tour> {
    public PlaceAdapter(Context context, ArrayList<Tour> tour) {
        super(context, 0, tour);
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }
        Tour currentPlace = getItem(position);
        ImageView image = (ImageView) listItemView.findViewById(R.id.place_image);
        image.setImageResource(currentPlace.getImageID());
        TextView place = (TextView) listItemView.findViewById(R.id.place_name);
        place.setText(currentPlace.getName());
        TextView distance = (TextView) listItemView.findViewById(R.id.distance);
        distance.setText(currentPlace.getDistance());
        TextView time = (TextView) listItemView.findViewById(R.id.travel_time);
        time.setText(currentPlace.getTime());
        return listItemView;
//        return super.getView(position, convertView, parent);
    }
}
