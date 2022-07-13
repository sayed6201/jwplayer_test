package com.example.jwplayertest.ui.dashboard;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jwplayertest.CustomJWPlayerView;
import com.example.jwplayertest.KeepScreenOnHandler;
import com.example.jwplayertest.MainBtnNavActivity;
import com.example.jwplayertest.R;
import com.example.jwplayertest.RecyclerViewAdapter;
import com.example.jwplayertest.databinding.FragmentDashboardBinding;
import com.example.jwplayertest.ui.home.HomeFragment;
import com.jwplayer.pub.api.JWPlayer;
import com.jwplayer.pub.api.PlayerState;
import com.jwplayer.pub.api.events.EventListener;
import com.jwplayer.pub.api.events.EventType;
import com.jwplayer.pub.api.events.FullscreenEvent;
import com.jwplayer.pub.api.events.listeners.VideoPlayerEvents;
import com.jwplayer.pub.api.license.LicenseUtil;
import com.jwplayer.pub.view.JWPlayerView;

import java.util.ArrayList;

import com.jwplayer.pub.api.configuration.PlayerConfig;
import com.jwplayer.pub.api.events.EventType;
import com.jwplayer.pub.api.media.playlists.PlaylistItem;
import java.util.List;



public class DashboardFragment extends Fragment implements
        VideoPlayerEvents.OnFullscreenListener,
        CustomJWPlayerView.ActivePlayerListener {

     FragmentDashboardBinding binding;
     ArrayList<JWPlayerView> mPlayers = new ArrayList<>();
     JWPlayerView mActivePlayer;
     KeepScreenOnHandler mKeepScreenOnHandler;
//     Context thiscontext;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        DashboardViewModel dashboardViewModel =
//                new ViewModelProvider(this).get(DashboardViewModel.class);

//        thiscontext = container.getContext();

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        new LicenseUtil().setLicenseKey(getContext(), "n/o34UmOVm0xXtukKillgolHq6UnpE8B8myrLUe9LnvATBovTHSyFGTDtxOWmOKk");

        mKeepScreenOnHandler = new KeepScreenOnHandler(getActivity().getWindow());

        ArrayList<ItemBase> items = new ArrayList<>();

        items.add(new ListVideoItem(new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/IkMciQZ1.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img3.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034")
//										.mediaId("IkMciQZ1")
                .title("Virtual Home")
                .build()));
        items.add(new ListVideoItem(new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/IkMciQZ1.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img5.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034")
//										.mediaId("IkMciQZ1")
                .title("Spatial Mapping")
                .build()));

        items.add(new ListVideoItem(new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/IkMciQZ1.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img6.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034")
//										.mediaId("IkMciQZ1")
                .title("")
                .build()));
        items.add(new ListVideoItem(new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/IkMciQZ1.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img8.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034")
//										.mediaId("IkMciQZ1")
                .title("Jellyfish")
                .build()));

        items.add(new ListVideoItem(new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/IkMciQZ1.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img14.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034")
//										.mediaId("IkMciQZ1")
                .title("Press Play")
                .build()));
        items.add(new ListVideoItem(new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/IkMciQZ1.m3u8")
                .image("https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img12.png?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034")
//										.mediaId("IkMciQZ1")
                .title("Jellyfish")
                .build()));


        RecyclerView recyclerView = binding.recyclerViewList;

        MyRecyclerViewAdapter recyclerViewAdapter = new MyRecyclerViewAdapter(items);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);
//        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

//    @Override
//    public void onAttach(Activity activity) {
//        super.onAttach(activity);
////        DBHelper = new DatabaseHelper(activity);
//    }

    @Override
    public void onFullscreen(FullscreenEvent fullscreenEvent) {
        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (actionBar != null) {
            if (fullscreenEvent.getFullscreen()) {
                actionBar.hide();
            } else {
                actionBar.show();
            }
        }
    }

//    private ActionBar getSupportActionBar() {
//    }

    @Override
    public void onPlayerActive(JWPlayerView activePlayer) {
        mActivePlayer = activePlayer;
        mKeepScreenOnHandler.addListeners(mActivePlayer.getPlayer());

        for(JWPlayerView playerView : mPlayers){
            // If a player was playing, then it was previously set as the active player, pause() and remove listeners
            JWPlayer player = playerView.getPlayer();
            if (player.getState() == PlayerState.PLAYING && !playerView.equals(mActivePlayer)) {
                player.pause();
                mKeepScreenOnHandler.removeListeners(player);
            }
        }
    }

    class ItemBase {

    }
    class ListVideoItem extends ItemBase {
        public PlaylistItem playlistItem;

        ListVideoItem(PlaylistItem playlistItem) {
            this.playlistItem = playlistItem;
        }
    }



    public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private ArrayList<ItemBase> mData;
        private Context context;

        //    private class TextViewHolder extends RecyclerView.ViewHolder {
//        public TextView textView;
//
//        public TextViewHolder(View v) {
//            super(v);
//            textView = v.findViewById(R.id.text_view);
//        }
//    }
//
        private class VideoViewHolder extends RecyclerView.ViewHolder {
            public JWPlayerView playerView;
            public JWPlayer player;

            public VideoViewHolder(View v) {
                super(v);
                playerView = v.findViewById(R.id.player_view);
                player = playerView.getPlayer();
            }
        }

        public MyRecyclerViewAdapter(ArrayList<ItemBase> data) {
            super();
            this.mData = data;
        }

        @Override
        public int getItemViewType(int position) {
//        if (mData.get(position) instanceof TextItem) {
//            return 0;
//        } else if (mData.get(position) instanceof VideoItem) {
//            return 1;
//        }
            return position;
        }

        @Override
        public int getItemCount() {
            return mData.size();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v;
//        switch (viewType) {
//            case 0:
//                v = LayoutInflater.from(parent.getContext())
//                        .inflate(R.layout.recycler_text_cell, parent, false);
//                return new TextViewHolder(v);
//            case 1:
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.dash_vid_player_list, parent, false);
            CustomJWPlayerView playerView = v.findViewById(R.id.player_view);
            JWPlayer player = playerView.getPlayer();
            player.addListener(EventType.FULLSCREEN,DashboardFragment.this);
            playerView.setActivePlayerListener(DashboardFragment.this);
            mPlayers.add(playerView);
            return new VideoViewHolder(v);
//        }
//            return null;
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
//        switch (holder.getItemViewType()) {
//            case 0:
//                TextItem textItem = (TextItem)mData.get(position);
//                TextViewHolder textViewHolder = (TextViewHolder)holder;
//                textViewHolder.textView.setText(textItem.text);
//                break;
//            case 1:
                ListVideoItem videoItem = (ListVideoItem) mData.get(position);
                VideoViewHolder videoViewHolder = (VideoViewHolder)holder;
                List<PlaylistItem> playlist = new ArrayList<>();
                playlist.add(videoItem.playlistItem);

                PlayerConfig playerConfig = new PlayerConfig.Builder()
                        .playlist(playlist)
                        .build();
                videoViewHolder.player.setup(playerConfig);
//                break;
//        }
        }
    }


}