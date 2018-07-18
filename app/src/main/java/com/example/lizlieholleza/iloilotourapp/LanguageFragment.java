package com.example.lizlieholleza.iloilotourapp;

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
        final ArrayList<Tour> language = new ArrayList<Tour>();
        language.add(new Tour("Beautiful1", "Gwapa", R.raw.family_older_sister, R.drawable.miagao));
        language.add(new Tour("Beautiful2", "Gwapa", R.raw.family_older_sister, R.drawable.miagao));
        language.add(new Tour("Beautiful3", "Gwapa", R.raw.family_older_sister, R.drawable.miagao));
        language.add(new Tour("Beautiful4", "Gwapa", R.raw.family_older_sister, R.drawable.miagao));
        language.add(new Tour("Beautiful5", "Gwapa", R.raw.family_older_sister, R.drawable.miagao));
        language.add(new Tour("Beautiful6", "Gwapa", R.raw.family_older_sister, R.drawable.miagao));
        language.add(new Tour("Beautiful7", "Gwapa", R.raw.family_older_sister, R.drawable.miagao));
        language.add(new Tour("Beautiful8", "Gwapa", R.raw.family_older_sister, R.drawable.miagao));

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
