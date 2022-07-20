package com.example.jwplayertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jwplayer.pub.api.JWPlayer;
import com.jwplayer.pub.api.configuration.PlayerConfig;
import com.jwplayer.pub.api.license.LicenseUtil;
import com.jwplayer.pub.api.media.playlists.PlaylistItem;
import com.jwplayer.pub.view.JWPlayerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
    private JWPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new LicenseUtil().setLicenseKey(this, "rEl02VN07UzNJ2qx60EHu+nnUEPsjcGj3alK/8XTBqfFRD1n5VhL5pox0KXlo79j");

        JWPlayerView playerView = findViewById(R.id.jwplayer);
        mPlayer = playerView.getPlayer();

        PlaylistItem playlistItem = new PlaylistItem.Builder()

                .file("https://cdn.jwplayer.com/manifests/Hop1p6MT.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/im1.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034")
                .title("Nreal SDK")
                .build();

        PlaylistItem playlistItem2 = new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/YREA7pa9.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img5.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034")
                .title("Unity 3D")
//                .description("Some really great content")
                .build();


        PlaylistItem playlistItem3 = new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/DHuJhP48.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img7.jpg?alt=media&token=bcc99984-cfd2-48f0-91c3-bb8a38b225d3")
//                .description("The Great Ship")
                .build();

        PlaylistItem playlistItem4 = new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/6TOmlR5O.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img3.jpg?alt=media&token=b367608d-3e7c-4dd6-8f13-4cd9d0d19ccd")
//                .title("Dark Box")
                .description("The Great Ship")
                .build();

        PlaylistItem playlistItem5 = new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/YREA7pa9.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img2.jpg?alt=media&token=c0f28b7a-1268-4096-835c-1dd2f6e7549b")
                .title("NReal")
//                .description("The Great Ship")
                .build();

        PlaylistItem playlistItem6 = new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/Hop1p6MT.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img10.jpg?alt=media&token=d751c34a-8a46-479e-8d16-af9305a3e385")
                .title("Dark Box")
                .description("The Great Ship")
                .build();

        List<PlaylistItem> playlist = new ArrayList<>();
        playlist.add(playlistItem);
        playlist.add(playlistItem2);
        playlist.add(playlistItem3);
        playlist.add(playlistItem4);
        playlist.add(playlistItem5);
        playlist.add(playlistItem6);



        PlayerConfig config = new PlayerConfig.Builder()
                .playlist(playlist)
//                .playlistUrl("https://cdn.jwplayer.com/v2/playlists/nrealDemoVidz")
                .build();

//        PlayerConfig config = new PlayerConfig.Builder()
//                .playlistUrl("https://cdn.jwplayer.com/v2/playlists/qR2QB5Ar")
//                .build();


        mPlayer.setup(config);
    }
}