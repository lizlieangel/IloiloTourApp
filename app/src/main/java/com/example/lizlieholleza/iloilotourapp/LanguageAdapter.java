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

public class LanguageAdapter extends ArrayAdapter<Tour> {
    public LanguageAdapter(Context context, ArrayList<Tour> language) {
        super(context, 0, language);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.language_details,parent, false);
        }
        Tour currentLanguage = getItem(position);
        ImageView image = (ImageView) listItemView.findViewById(R.id.lang_image);
        image.setImageResource(currentLanguage.getImageID());
        TextView nat_lang = (TextView) listItemView.findViewById(R.id.native_lang);
        nat_lang.setText(currentLanguage.getNativeWord());
        TextView eng_lang = (TextView) listItemView.findViewById(R.id.eng_lang);
        eng_lang.setText(currentLanguage.getEnglishWord());
        return listItemView;
    }
}
