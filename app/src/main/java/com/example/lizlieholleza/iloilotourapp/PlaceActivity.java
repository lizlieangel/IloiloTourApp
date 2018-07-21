package com.example.lizlieholleza.iloilotourapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);
        ImageView place_image = (ImageView) findViewById(R.id.pInfo_image);
        TextView place_name = (TextView) findViewById(R.id.pInfo_place);
        TextView place_distance = (TextView) findViewById(R.id.pInfo_distance);
        TextView place_time = (TextView) findViewById(R.id.pInfo_time);

        Tour place = new Tour();
        place_image.setImageResource(place.getImageID());
        place_name.setText(place.getName());
        place_distance.setText(place.getDistance());
        place_time.setText(place.getTime());
    }


}
