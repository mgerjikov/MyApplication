package com.example.android.musicalapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public class RadioActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        // Home Icon
        // Find the View that shows the home text category
        TextView home = (TextView) findViewById(R.id.activity_radio_home_id);
        // Setting a OnClickListener to that TextView
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home TextView is clicked on.
            @Override
            public void onClick(View view) {
                // Explicit intent that will be executed when the View is clicked
                Intent homeIntent = new Intent(RadioActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        // Find the View that shows the home image category
        ImageView homeImage = (ImageView) findViewById(R.id.activity_radio_home_image_id);
        // Setting a OnClickListener to that ImageView
        homeImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home ImageView is clicked on.
            @Override
            public void onClick(View view) {
                // Explicit intent that will be executed when the View is clicked
                Intent homeIntent = new Intent(RadioActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        // Browse Icon
        // Find the View that shows the Browse text category
        TextView search = (TextView) findViewById(R.id.activity_radio_search_id);
        // Setting a OnClickListener to that TextView
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent searchIntent = new Intent(RadioActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });
        // Find the View that shows the browse image category
        ImageView searchImage = (ImageView) findViewById(R.id.activity_radio_search_image_id);
        // Setting a OnClickListener to that ImageView
        searchImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent searchImageIntent = new Intent(RadioActivity.this, SearchActivity.class);
                startActivity(searchImageIntent);
            }
        });
        // Add Icon
        // Find the View that shows the add text category
        TextView add = (TextView) findViewById(R.id.activity_radio_add_new_id);
        // Setting a OnClickListener to that TextView
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent addIntent = new Intent(RadioActivity.this, AddActivity.class);
                startActivity(addIntent);
            }
        });
        // Find the View that shows the add image category
        ImageView addImage = (ImageView) findViewById(R.id.activity_radio_add_new_image_id);
        // Setting a OnClickListener to that ImageView
        addImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent addImageIntent = new Intent(RadioActivity.this, AddActivity.class);
                startActivity(addImageIntent);
            }
        });
        // Playlists Icon
        // Find the View that shows the Playlist text category
        TextView playlist = (TextView) findViewById(R.id.activity_radio_playlist_id);
        // Setting a OnClickListener to that TextView
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent playlistIntent = new Intent(RadioActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
        // Find the View that shows the playlist image category
        ImageView playlistImage = (ImageView) findViewById(R.id.activity_radio_playlist_image_id);
        // Setting a OnClickListener to that ImageView
        playlistImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent playlistImageIntent = new Intent(RadioActivity.this, PlaylistActivity.class);
                startActivity(playlistImageIntent);
            }
        });
        // Mood Icon
        // Find the View that shows the Mood text category
        TextView mood = (TextView) findViewById(R.id.activity_radio_mood_id);
        // Setting a OnClickListener to that TextView
        mood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent moodIntent = new Intent(RadioActivity.this, MoodActivity.class);
                startActivity(moodIntent);
            }
        });
        // Find the View that shows the mood image category
        ImageView moodImage = (ImageView) findViewById(R.id.activity_radio_mood_image_id);
        // Setting a OnClickListener to that ImageView
        moodImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent moodImageIntent = new Intent(RadioActivity.this, MoodActivity.class);
                startActivity(moodImageIntent);
            }
        });
        // Playing now Icon
        // Find the View that shows the "Now" text category
        final TextView playNow = (TextView) findViewById(R.id.activity_radio_playing_now_id);
        // Setting a OnClickListener to that TextView
        playNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent playNowIntent = new Intent(RadioActivity.this, NowPlaying.class);
                startActivity(playNowIntent);
            }
        });
        // Find the View that shows the playing now image category
        ImageView playNowImage = (ImageView) findViewById(R.id.activity_radio_playing_now_image_id);
        // Setting a OnClickListener to that ImageView
        playNowImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent playNowImageIntent = new Intent(RadioActivity.this, NowPlaying.class);
                startActivity(playNowImageIntent);
            }
        });
    }
}
