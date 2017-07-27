package com.example.android.musicalapp;

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
        // Now Playing in Welcome Screen
        // Finding the TextView that represent Now Playing text on the screen
        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying_id);
        // Setting a OnClickListener to that TextView
        nowPlaying.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Explicit intent that will be executed when the TextView is clicked
                Intent nowPlayingIntent = new Intent(MainActivity.this,NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });
        // Playlist in Welcome Screen
        // Finding the TextView that represent Playlists text on the screen
        TextView playLists = (TextView) findViewById(R.id.playList_id);
        // Setting a OnClickListener to that TextView
        playLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the TextView is clicked
                Intent playListIntent = new Intent(MainActivity.this,PlaylistActivity.class);
                startActivity(playListIntent);
            }
        });
        // Radio in Welcome Screen
        // Finding the TextView that represent Radio text on the screen
        TextView radio = (TextView) findViewById(R.id.radio_id);
        // Setting a OnClickListener to that TextView
        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the TextView is clicked
                Intent radioIntent = new Intent(MainActivity.this,RadioActivity.class);
                startActivity(radioIntent);
            }
        });
        // Browse in Welcome Screen
        // Finding the TextView that represent Browse text on the screen
        TextView search = (TextView) findViewById(R.id.search_id);
        // Setting a OnClickListener to that TextView
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the TextView is clicked
                Intent searchIntent = new Intent(MainActivity.this,SearchActivity.class);
                startActivity(searchIntent);
            }
        });
        // Mood in Welcome Screen
        // Finding the TextView that represent Mood text on the screen
        TextView mood = (TextView) findViewById(R.id.mood_id);
        // Setting a OnClickListener to that TextView
        mood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the TextView is clicked
                Intent moodIntent = new Intent(MainActivity.this,MoodActivity.class);
                startActivity(moodIntent);
            }
        });
        // +Add in Welcome Screen
        // Finding the TextView that represent +Add text on the screen
        TextView addNew = (TextView) findViewById(R.id.addNew_id);
        // Setting a OnClickListener to that TextView
        addNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the TextView is clicked
                Intent addNewIntent = new Intent(MainActivity.this,AddActivity.class);
                startActivity(addNewIntent);
            }
        });
    }
}
