//package com.example.jwplayertest.adapter;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.jwplayertest.CustomJWPlayerView;
//import com.example.jwplayertest.MainBtnNavActivity;
//import com.example.jwplayertest.R;
//import com.example.jwplayertest.ui.home.HomeFragment;
//import com.jwplayer.pub.api.JWPlayer;
//import com.jwplayer.pub.api.configuration.PlayerConfig;
//import com.jwplayer.pub.api.events.EventListener;
//import com.jwplayer.pub.api.events.EventType;
//import com.jwplayer.pub.api.media.playlists.PlaylistItem;
//import com.jwplayer.pub.view.JWPlayerView;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
//    private ArrayList<HomeFragment.ItemBase> mData;
//    private MainBtnNavActivity context;
//
////    private class TextViewHolder extends RecyclerView.ViewHolder {
////        public TextView textView;
////
////        public TextViewHolder(View v) {
////            super(v);
////            textView = v.findViewById(R.id.text_view);
////        }
////    }
////
//    private class VideoViewHolder extends RecyclerView.ViewHolder {
//        public JWPlayerView playerView;
//        public JWPlayer player;
//
//        public VideoViewHolder(View v) {
//            super(v);
//            playerView = v.findViewById(R.id.player_view);
//            player = playerView.getPlayer();
//        }
//    }
//
//    public MyRecyclerViewAdapter(ArrayList<HomeFragment.ItemBase> data, MainBtnNavActivity context) {
//        super();
//        this.mData = data;
//        this.context = context;
//    }
//
//    @Override
//    public int getItemViewType(int position) {
////        if (mData.get(position) instanceof TextItem) {
////            return 0;
////        } else if (mData.get(position) instanceof VideoItem) {
////            return 1;
////        }
//        return position;
//    }
//
//    @Override
//    public int getItemCount() {
//        return mData.size();
//    }
//
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View v;
////        switch (viewType) {
////            case 0:
////                v = LayoutInflater.from(parent.getContext())
////                        .inflate(R.layout.recycler_text_cell, parent, false);
////                return new TextViewHolder(v);
////            case 1:
//                v = LayoutInflater.from(parent.getContext())
//                        .inflate(R.layout.recycler_video_cell, parent, false);
//                CustomJWPlayerView playerView = v.findViewById(R.id.player_view);
//                JWPlayer player = playerView.getPlayer();
//                player.addListener(EventType.FULLSCREEN, (EventListener) context);
//                playerView.setActivePlayerListener((CustomJWPlayerView.ActivePlayerListener) context);
//                mPlayers.add(playerView);
//                return new VideoViewHolder(v);
////        }
////        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
////        switch (holder.getItemViewType()) {
////            case 0:
////                TextItem textItem = (TextItem)mData.get(position);
////                TextViewHolder textViewHolder = (TextViewHolder)holder;
////                textViewHolder.textView.setText(textItem.text);
////                break;
////            case 1:
////                VideoItem videoItem = (VideoItem)mData.get(position);
////                VideoViewHolder videoViewHolder = (VideoViewHolder)holder;
////                List<PlaylistItem> playlist = new ArrayList<>();
////                playlist.add(videoItem.playlistItem);
////
////                PlayerConfig playerConfig = new PlayerConfig.Builder()
////                        .playlist(playlist)
////                        .build();
////                videoViewHolder.player.setup(playerConfig);
////                break;
////        }
//    }
//}
//
