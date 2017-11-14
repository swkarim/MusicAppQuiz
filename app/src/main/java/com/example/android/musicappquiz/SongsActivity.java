package com.example.android.musicappquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        TextView folderName = (TextView) findViewById(R.id.folder_name);
        TextView songNameOne = (TextView) findViewById(R.id.song_name_one);
        TextView songNameTwo = (TextView) findViewById(R.id.song_name_two);
        TextView songNameThree = (TextView) findViewById(R.id.song_name_three);

        //Check the folder name and set the song names accordingly.
        Intent intent = getIntent();
        String screenTitle = intent.getStringExtra("screenTitle");
        folderName.setText(screenTitle);

        if(screenTitle.equalsIgnoreCase("favorites")){
            songNameOne.setText("Redbone by Childish Gambino");
            songNameTwo.setText("Wounds by Quinn XCII");
            songNameThree.setText("Madness by Muse");
        }

        if(screenTitle.equalsIgnoreCase("drive ost")){
            songNameOne.setText("Nightcall by Kavinsky");
            songNameTwo.setText("Under Your Spell by Desire");
            songNameThree.setText("Oh My Love by Riz Ortolani");
        }

        findViewById(R.id.song_name_one).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView songName = (TextView) findViewById(R.id.song_name_one);
                String songNameToSend = songName.getText().toString();
                Intent intent = new Intent(getApplicationContext(), CurrentSongActivity.class);
                intent.putExtra("songName", songNameToSend);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(intent);
            }
        });

        findViewById(R.id.song_name_two).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView songName = (TextView) findViewById(R.id.song_name_two);
                String songNameToSend = songName.getText().toString();
                Intent intent = new Intent(getApplicationContext(), CurrentSongActivity.class);
                intent.putExtra("songName", songNameToSend);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(intent);
            }
        });

        findViewById(R.id.song_name_three).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView songName = (TextView) findViewById(R.id.song_name_three);
                String songNameToSend = songName.getText().toString();
                Intent intent = new Intent(getApplicationContext(), CurrentSongActivity.class);
                intent.putExtra("songName", songNameToSend);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(intent);
            }
        });

    }
}
