package com.example.lizlieholleza.iloilotourapp;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class LanguageFragment extends Fragment {
    private MediaPlayer mediaPlayer;
    private AudioManager audioManager;

    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    private AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
            } else if(focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                mediaPlayer.start();
            } else if(focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                releaseMediaPlayer();
            }
        }
    };
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.item_list, container, false);
        audioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);
        final ArrayList<Tour> language = new ArrayList<Tour>();
        language.add(new Tour("You're beautiful.", "Kagwapa simu.", R.raw.family_older_sister, R.drawable.h));
        language.add(new Tour("I don't want to.", "Indi takun.", R.raw.family_older_sister, R.drawable.k));
        language.add(new Tour("I love you.", "Palangga ta ikaw.", R.raw.family_older_sister, R.drawable.h));
        language.add(new Tour("I can't live without you.", "Di takun mabuhi kung wara ka.", R.raw.family_older_sister, R.drawable.h));
        language.add(new Tour("Turn right.", "Liko sa tuo.", R.raw.family_older_sister, R.drawable.k));
        language.add(new Tour("Go home.", "Pagpuli run.", R.raw.family_older_sister, R.drawable.h));
        language.add(new Tour("I don't know what to do.", "Indi ko bal-an kung ano akun ubrahon.", R.raw.family_older_sister, R.drawable.h));
        language.add(new Tour("There's a dog!", "May ayam!", R.raw.family_older_sister, R.drawable.k));

        LanguageAdapter adapter = new LanguageAdapter(getActivity(), language);
        releaseMediaPlayer();
        ListView lv = (ListView) rootview.findViewById(R.id.item_list);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                releaseMediaPlayer();
                Tour lang = language.get(position);
                int result = audioManager.requestAudioFocus(mAudioFocusChangeListener, AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                if(result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    mediaPlayer = MediaPlayer.create(getActivity(), lang.getSoundID());
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(mCompletionListener);
                }
            }
        });
        return  rootview;
    }

    public void releaseMediaPlayer() {
        if(mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
            audioManager.abandonAudioFocus(mAudioFocusChangeListener);
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }
}
