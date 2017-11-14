package com.example.android.musicappquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class CurrentSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_song);

        Intent intent = getIntent();
        String songName = intent.getStringExtra("songName");

        TextView displaySongName = (TextView) findViewById(R.id.now_playing);
        displaySongName.setText(songName);
    }
}
