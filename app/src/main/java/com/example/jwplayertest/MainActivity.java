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

        new LicenseUtil().setLicenseKey(this, "n/o34UmOVm0xXtukKillgolHq6UnpE8B8myrLUe9LnvATBovTHSyFGTDtxOWmOKk");

        JWPlayerView playerView = findViewById(R.id.jwplayer);
        mPlayer = playerView.getPlayer();

        PlaylistItem playlistItem = new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/YREA7pa9.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/im1.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034")
                .title("Unreal Game Engine")
                .build();

        PlaylistItem playlistItem2 = new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/ViCD3045.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img5.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034")
                .title("Unity 3D")
                .description("Some really great content")
                .build();


        PlaylistItem playlistItem3 = new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/xvMX5Lub.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img6.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034")
                .title("Dark Box")
                .description("The Great Ship")
                .build();

        PlaylistItem playlistItem4 = new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/xvMX5Lub.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img8.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034")
                .title("Dark Box")
                .description("The Great Ship")
                .build();

        PlaylistItem playlistItem5 = new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/xvMX5Lub.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img8.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034")
                .title("Dark Box")
                .description("The Great Ship")
                .build();

        PlaylistItem playlistItem6 = new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/xvMX5Lub.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img8.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034")
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
                .build();

        mPlayer.setup(config);
    }
}