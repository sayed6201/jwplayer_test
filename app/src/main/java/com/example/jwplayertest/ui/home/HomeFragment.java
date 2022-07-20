package com.example.jwplayertest.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jwplayertest.Gridview;
import com.example.jwplayertest.MainActivity;
import com.example.jwplayertest.R;
import com.example.jwplayertest.RecyclerViewAdapter;
import com.example.jwplayertest.TrendingActivity;
import com.example.jwplayertest.databinding.FragmentHomeBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    ArrayList vidData = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        HomeViewModel homeViewModel =
//                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);


        vidData.add(new VideoItem("Elephant","Bird 1", "https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/Screenshot%202022-07-20%20at%2012.41.05.png?alt=media&token=159586a6-a71b-478c-890a-b8f126e0c0d7"));
        vidData.add(new VideoItem("Costa Rica","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/Screenshot%202022-07-20%20at%2012.40.57.png?alt=media&token=f1423158-9500-4172-8aee-0c763b64188d"));
        vidData.add(new VideoItem("The World","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/Screenshot%202022-07-20%20at%2012.40.53.png?alt=media&token=ff44dec7-f049-4516-9730-7d0002c7f88b"));
        vidData.add(new VideoItem("Pexels","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/Screenshot%202022-07-20%20at%2012.40.48.png?alt=media&token=7dd79824-e2ad-453c-9878-3e619141ddc3"));
        vidData.add(new VideoItem("Sony","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/Screenshot%202022-07-20%20at%2012.40.44.png?alt=media&token=075158e5-17fc-4cd5-b781-ccad202a04d6"));
        vidData.add(new VideoItem("Apps","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/Screenshot%202022-07-20%20at%2012.39.53.png?alt=media&token=2acb4b4a-6ddf-4a27-8e95-60a01df432fe"));
        vidData.add(new VideoItem("nreal","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/Screenshot%202022-07-20%20at%2012.39.53.png?alt=media&token=2acb4b4a-6ddf-4a27-8e95-60a01df432fe"));
        vidData.add(new VideoItem("MR","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/Screenshot%202022-07-20%20at%2012.39.37.png?alt=media&token=02ed8983-8dc6-41e5-9fb2-2b9d94b276a7"));
        vidData.add(new VideoItem("Nreal","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img10.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
        vidData.add(new VideoItem("SDK","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img11.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
        vidData.add(new VideoItem("App","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img12.png?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
        vidData.add(new VideoItem("MR","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img14.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));


        final RecyclerView recyclerView = binding.recyclerView;
//        recyclerView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getContext(), "hello", Toast.LENGTH_SHORT).show();
//                Intent myIntent = new Intent(getContext(), MainActivity.class);
//                getActivity().startActivity(myIntent);
//            }
//        });
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(vidData, getContext());
        View root = binding.getRoot();

//        RecyclerView  = findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        myAdapter.setHasStableIds(true);
        recyclerView.setAdapter(myAdapter);

        FloatingActionButton fab = binding.fab;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent myIntent = new Intent(getContext(), TrendingActivity.class);
                getContext().startActivity(myIntent);
            }
        });


//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


        public class ItemBase {

    }


    public class VideoItem extends ItemBase {
        public String txt;
        public String url;
        public String img;
//        public String img_url;

        VideoItem(String txt, String url, String img) {
            this.txt = txt;
            this.url = url;
            this.img = img;
//            this.img_url = img_url;
        }
    }
}