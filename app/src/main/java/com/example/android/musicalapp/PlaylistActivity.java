package com.example.android.musicalapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public class PlaylistActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_added_playlists);
        // Home Icon
        // Find the View that shows the home text category
        TextView home = (TextView) findViewById(R.id.activity_added_playlist_home_id);
        // Setting a OnClickListener to that TextView
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home TextView is clicked on.
            @Override
            public void onClick(View view) {
                // Explicit intent that will be executed when the View is clicked
                Intent homeIntent = new Intent(PlaylistActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        // Find the View that shows the home image category
        ImageView homeImage = (ImageView) findViewById(R.id.activity_added_playlist_home_image_id);
        // Setting a OnClickListener to that ImageView
        homeImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home ImageView is clicked on.
            @Override
            public void onClick(View view) {
                // Explicit intent that will be executed when the View is clicked
                Intent homeIntent = new Intent(PlaylistActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        // Browse Icon
        // Find the View that shows the Browse text category
        TextView search = (TextView) findViewById(R.id.activity_added_playlist_search_id);
        // Setting a OnClickListener to that TextView
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent searchIntent = new Intent(PlaylistActivity.this,SearchActivity.class);
                startActivity(searchIntent);
            }
        });
        // Find the View that shows the browse image category
        ImageView searchImage = (ImageView) findViewById(R.id.activity_added_playlist_search_image_id);
        // Setting a OnClickListener to that ImageView
        searchImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent searchImageIntent = new Intent(PlaylistActivity.this,SearchActivity.class);
                startActivity(searchImageIntent);
            }
        });
        // Add Icon
        // Find the View that shows the add text category
        TextView add = (TextView) findViewById(R.id.activity_added_playlist_add_new_id);
        // Setting a OnClickListener to that TextView
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent addIntent = new Intent(PlaylistActivity.this,AddActivity.class);
                startActivity(addIntent);
            }
        });
        // Find the View that shows the add image category
        ImageView addImage = (ImageView) findViewById(R.id.activity_added_playlist_add_new_image_id);
        // Setting a OnClickListener to that ImageView
        addImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent addImageIntent = new Intent(PlaylistActivity.this,AddActivity.class);
                startActivity(addImageIntent);
            }
        });
        // Playing now Icon
        // Find the View that shows the "Now" text category
        TextView playingNow = (TextView) findViewById(R.id.activity_added_playlist_playing_now_id);
        // Setting a OnClickListener to that TextView
        playingNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent playingNowIntent = new Intent(PlaylistActivity.this,NowPlaying.class);
                startActivity(playingNowIntent);
            }
        });
        // Find the View that shows the playing now image category
        ImageView playingNowImage = (ImageView) findViewById(R.id.activity_added_playlist_playing_now_image_id);
        // Setting a OnClickListener to that ImageView
        playingNowImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent playingNowImageIntent = new Intent(PlaylistActivity.this,NowPlaying.class);
                startActivity(playingNowImageIntent);
            }
        });
        // Mood Icon
        // Find the View that shows the Mood text category
        TextView mood = (TextView) findViewById(R.id.activity_added_playlist_mood_id);
        // Setting a OnClickListener to that TextView
        mood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent moodIntent = new Intent(PlaylistActivity.this,MoodActivity.class);
                startActivity(moodIntent);
            }
        });
        // Find the View that shows the mood image category
        ImageView moodImage = (ImageView) findViewById(R.id.activity_added_playlist_mood_image_id);
        // Setting a OnClickListener to that ImageView
        moodImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent moodImageIntent = new Intent(PlaylistActivity.this,MoodActivity.class);
                startActivity(moodImageIntent);
            }
        });
        // Radio Icon
        // Find the View that shows the radio text category
        final TextView radio = (TextView) findViewById(R.id.activity_added_playlist_radio_id);
        // Setting a OnClickListener to that TextView
        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent radioIntent = new Intent(PlaylistActivity.this,RadioActivity.class);
                startActivity(radioIntent);
            }
        });
        // Find the View that shows the radio image category
        ImageView radioImage = (ImageView) findViewById(R.id.activity_added_playlist_radio_image_id);
        // Setting a OnClickListener to that ImageView
        radioImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit intent that will be executed when the View is clicked
                Intent radioIntent = new Intent(PlaylistActivity.this,RadioActivity.class);
                startActivity(radioIntent);
            }
        });
    }
}
