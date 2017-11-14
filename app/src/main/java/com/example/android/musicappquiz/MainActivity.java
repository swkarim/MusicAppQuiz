package com.example.android.musicappquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.favorite_songs).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView folderName = (TextView) findViewById(R.id.favorite_songs);
                String screenTitle = folderName.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SongsActivity.class);
                intent.putExtra("screenTitle", screenTitle);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(intent);
            }
        });

        findViewById(R.id.album_name_one).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView folderName = (TextView) findViewById(R.id.album_name_one);
                String screenTitle = folderName.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SongsActivity.class);
                intent.putExtra("screenTitle", screenTitle);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(intent);
            }
        });
    }
}
