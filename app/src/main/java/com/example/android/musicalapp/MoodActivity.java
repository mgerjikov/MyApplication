package com.example.android.musicalapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public class MoodActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood);
        // Home Icon
        // Find the View that shows the home text category
        TextView home = (TextView) findViewById(R.id.activity_mood_home_id);
        // Setting a OnClickListener to that TextView
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home TextView is clicked on.
            @Override
            public void onClick(View view) {
                // Explicit intent that will be executed when the View is clicked
                Intent homeIntent = new Intent(MoodActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        // Find the View that shows the home image category
        ImageView homeImage = (ImageView) findViewById(R.id.activity_mood_home_image_id);
        // Setting a OnClickListener to that ImageView
        homeImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home ImageView is clicked on.
            @Override
            public void onClick(View view) {
                // Explicit intent that will be executed when the View is clicked
                Intent homeIntent = new Intent(MoodActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        // Browse Icon
        // Find the View that shows the Browse text category
        TextView search = (TextView) findViewById(R.id.activity_mood_search_id);
        // Setting a OnClickListener to that TextView
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent searchIntent = new Intent(MoodActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });
        // Find the View that shows the browse image category
        ImageView searchImage = (ImageView) findViewById(R.id.activity_mood_search_image_id);
        // Setting a OnClickListener to that ImageView
        searchImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent searchImageIntent = new Intent(MoodActivity.this, SearchActivity.class);
                startActivity(searchImageIntent);
            }
        });
        // Add Icon
        // Find the View that shows the add text category
        TextView add = (TextView) findViewById(R.id.activity_mood_add_new_id);
        // Setting a OnClickListener to that TextView
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent addIntent = new Intent(MoodActivity.this, AddActivity.class);
                startActivity(addIntent);
            }
        });
        // Find the View that shows the add image category
        ImageView addImage = (ImageView) findViewById(R.id.activity_mood_add_new_image_id);
        // Setting a OnClickListener to that ImageView
        addImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent addImageIntent = new Intent(MoodActivity.this, AddActivity.class);
                startActivity(addImageIntent);
            }
        });
        // Playlists Icon
        // Find the View that shows the Playlist text category
        TextView playlist = (TextView) findViewById(R.id.activity_mood_playlists_id);
        // Setting a OnClickListener to that TextView
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent playlistIntent = new Intent(MoodActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
        // Find the View that shows the playlist image category
        ImageView playlistImage = (ImageView) findViewById(R.id.activity_mood_playlists_image_id);
        // Setting a OnClickListener to that ImageView
        playlistImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent playlistImageIntent = new Intent(MoodActivity.this, PlaylistActivity.class);
                startActivity(playlistImageIntent);
            }
        });
        // Playing now Icon
        // Find the View that shows the "Now" text category
        TextView playingNow = (TextView) findViewById(R.id.activity_mood_playing_now_id);
        // Setting a OnClickListener to that TextView
        playingNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent playingNowIntent = new Intent(MoodActivity.this, NowPlaying.class);
                startActivity(playingNowIntent);
            }
        });
        // Find the View that shows the playing now image category
        ImageView playingNowImage = (ImageView) findViewById(R.id.activity_mood_playing_now_image_id);
        // Setting a OnClickListener to that ImageView
        playingNowImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent playingNowImageIntent = new Intent(MoodActivity.this, NowPlaying.class);
                startActivity(playingNowImageIntent);
            }
        });
        // Radio Icon
        // Find the View that shows the radio text category
        TextView radio = (TextView) findViewById(R.id.activity_mood_radio_id);
        // Setting a OnClickListener to that TextView
        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent radioIntent = new Intent(MoodActivity.this, RadioActivity.class);
                startActivity(radioIntent);
            }
        });
        // Find the View that shows the radio image category
        ImageView radioImage = (ImageView) findViewById(R.id.activity_mood_radio_image_id);
        // Setting a OnClickListener to that ImageView
        radioImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent radioImageIntent = new Intent(MoodActivity.this,RadioActivity.class);
                startActivity(radioImageIntent);
            }
        });
    }
}
