package com.example.lizlieholleza.iloilotourapp;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import static android.provider.Settings.Global.getString;

public class PlaceAdapter extends ArrayAdapter<Tour> {
    public PlaceAdapter(Context context, ArrayList<Tour> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.place_details, parent, false);
        }
        Tour currentPlace = getItem(position);
        ImageView image = (ImageView) listItemView.findViewById(R.id.place_image);
        image.setImageResource(currentPlace.getImageID());
        TextView place = (TextView) listItemView.findViewById(R.id.place_name);
        place.setText(currentPlace.getName());
        TextView distance = (TextView) listItemView.findViewById(R.id.distance);
        distance.setText("Distance: " + currentPlace.getDistance());
        TextView time = (TextView) listItemView.findViewById(R.id.travel_time);
        time.setText("Travel time:" + currentPlace.getTime());
        return listItemView;
    }
}
