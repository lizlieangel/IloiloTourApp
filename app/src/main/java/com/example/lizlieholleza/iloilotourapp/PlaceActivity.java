package com.example.lizlieholleza.iloilotourapp;

import android.content.Intent;
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
        Intent intent = getIntent();


        ImageView place_image = (ImageView) findViewById(R.id.pInfo_image);
        TextView place_name = (TextView) findViewById(R.id.pInfo_place);
        TextView place_distance = (TextView) findViewById(R.id.pInfo_distance);
        TextView place_time = (TextView) findViewById(R.id.pInfo_time);

        int image = intent.getIntExtra("pInfo_image", 0);
        String place = intent.getStringExtra("pInfo_place");
        String distance = intent.getStringExtra("pInfo_distance");
        String time = intent.getStringExtra("pInfo_time");

//
//        Tour place = new Tour();
        place_image.setImageResource(image);
        place_name.setText(place);
        place_distance.setText(distance);
        place_time.setText(time);
    }


}
