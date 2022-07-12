package com.example.jwplayertest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.GridView;

import com.jwplayer.pub.api.media.playlists.PlaylistItem;

import java.util.ArrayList;

public class Gridview extends AppCompatActivity {

    GridView simpleList;
    ArrayList vidData = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);

//        simpleList = (GridView) findViewById(R.id.simpleGridView);

//        vidData.add(new VideoItem("Nreal sdk","Bird 1", "https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/im1.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
//        vidData.add(new VideoItem("Holo 2","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img3.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
//        vidData.add(new VideoItem("Abx 3","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img4.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
//        vidData.add(new VideoItem("AR","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img5.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
//        vidData.add(new VideoItem("MR","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img6.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
//        vidData.add(new VideoItem("Apps","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img7.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
//        vidData.add(new VideoItem("nreal","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img8.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
//        vidData.add(new VideoItem("MR","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img9.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
//        vidData.add(new VideoItem("Nreal","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img10.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
//        vidData.add(new VideoItem("SDK","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img11.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
//        vidData.add(new VideoItem("App","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img12.png?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
//        vidData.add(new VideoItem("MR","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img14.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
//
//
//        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(vidData);
//
//        RecyclerView recyclerView = findViewById(R.id.recycler_view);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
//        myAdapter.setHasStableIds(true);
//        recyclerView.setAdapter(myAdapter);

    }

//    class ItemBase {
//
//    }
//
//
//    public class VideoItem extends ItemBase {
//        public String txt;
//        public String url;
//        public String img;
////        public String img_url;
//
//        VideoItem(String txt, String url, String img) {
//            this.txt = txt;
//            this.url = url;
//            this.img = img;
////            this.img_url = img_url;
//        }
//    }
}