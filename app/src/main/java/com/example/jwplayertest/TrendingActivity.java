package com.example.jwplayertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.jwplayer.pub.api.JWPlayer;
import com.jwplayer.pub.api.configuration.PlayerConfig;
import com.jwplayer.pub.api.license.LicenseUtil;
import com.jwplayer.pub.view.JWPlayerView;

public class TrendingActivity extends AppCompatActivity {

    private JWPlayer mPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending);



        new LicenseUtil().setLicenseKey(this, "rEl02VN07UzNJ2qx60EHu+nnUEPsjcGj3alK/8XTBqfFRD1n5VhL5pox0KXlo79j");

        JWPlayerView playerView = findViewById(R.id.jwplayer_trending);
        mPlayer = playerView.getPlayer();

        PlayerConfig config = new PlayerConfig.Builder()
                .playlistUrl("https://cdn.jwplayer.com/v2/playlists/qR2QB5Ar")
                .build();
        mPlayer.setup(config);

    }
}