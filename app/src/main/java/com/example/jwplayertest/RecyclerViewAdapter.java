package com.example.jwplayertest;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.jwplayertest.ui.home.HomeFragment;
import com.jwplayer.pub.api.JWPlayer;
import com.jwplayer.pub.api.configuration.PlayerConfig;
import com.jwplayer.pub.api.configuration.UiConfig;
import com.jwplayer.pub.api.events.EventType;
import com.jwplayer.pub.api.media.playlists.PlaylistItem;
import com.jwplayer.pub.view.JWPlayerView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<HomeFragment.VideoItem> mData;
    private Context context;


//    private class TextViewHolder extends RecyclerView.ViewHolder {
//        public TextView textView;
//
//        public TextViewHolder(View v) {
//            super(v);
//            textView = v.findViewById(R.id.text_view);
//        }
//    }

    private class VideoViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public  TextView textview;
//        public JWPlayer player;


        public VideoViewHolder(View v) {
            super(v);
            imageView = v.findViewById(R.id.player_view);
            textview = v.findViewById(R.id.textView);

//            player = playerView.getPlayer();
        }
    }

    public RecyclerViewAdapter(ArrayList<HomeFragment.VideoItem> data, Context context) {
        super();
        mData = data;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
//			if (mData.get(position) instanceof TextItem) {
//				return 0;
//			} else if (mData.get(position) instanceof VideoItem) {
//				return 1;
//			}
        return position;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

//		@Override
//		public boolean onLongClick(View view) {
//			// Handle long click
//			// Return true to indicate the click was handled
//			Toast.makeText(v.getContext(), "Position is " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
//			return true;
//		}

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
//			switch (viewType) {
//				case 0:
//					v = LayoutInflater.from(parent.getContext())
//									  .inflate(R.layout.recycler_text_cell, parent, false);
//					return new TextViewHolder(v);
//				case 1:
        v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_video_cell, parent, false);
        RecyclerView.ViewHolder holder =(RecyclerView.ViewHolder)v.getTag();


//        CustomJWPlayerView playerView = v.findViewById(R.id.player_view);
//        JWPlayer player = playerView.getPlayer();
//        player.addListener(EventType.FULLSCREEN,MainActivity.this);
//        playerView.setActivePlayerListener(MainActivity.this);
//        mPlayers.add(playerView);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(context, MainActivity.class);
                context.startActivity(myIntent);
            }
        });

        return new VideoViewHolder(v);
//			}
//			return null;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
//			switch (holder.getItemViewType()) {
//				case 0:
//					TextItem textItem = (TextItem)mData.get(position);
//					TextViewHolder textViewHolder = (TextViewHolder)holder;
//					textViewHolder.textView.setText(textItem.text);
//					break;
//				case 1:
//        VideoItem videoItem = (VideoItem)mData.get(position);
        VideoViewHolder videoViewHolder = (VideoViewHolder) holder;
//        List<PlaylistItem> playlist = new ArrayList<>();
//        playlist.add(videoItem.playlistItem);

//        UiConfig hideJwControlbarUiConfig = new UiConfig.Builder()
//							.hide(UiGroup.SETTINGS_MENU)
//                .build();
//
//
//        PlayerConfig playerConfig = new PlayerConfig.Builder()
//                .playlist(playlist)
//							.autostart(true)
//							.uiConfig(hideJwControlbarUiConfig)
//                .build();
        HomeFragment.VideoItem itemBase = mData.get(position);
//
        Picasso.get().load(itemBase.img).fit().centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(((VideoViewHolder) holder).imageView);
//        videoViewHolder.imageView.setImageDrawable(itemBase.img);
        videoViewHolder.textview.setText(itemBase.txt);
//					break;
//			}
    }
}

