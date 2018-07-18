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

import java.util.ArrayList;

public class EventAdapter extends ArrayAdapter<Tour> {
    public EventAdapter(Context context, ArrayList<Tour> events) {
        super(context, 0,events);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.event_details,parent,false);
        }
        Tour currentEvent = getItem(position);
        ImageView image = (ImageView) listItemView.findViewById(R.id.event_image);
        image.setImageResource(currentEvent.getImageID());
        TextView event_title = (TextView) listItemView.findViewById(R.id.event_name);
        event_title.setText(currentEvent.getName());
        return listItemView;
    }
}
