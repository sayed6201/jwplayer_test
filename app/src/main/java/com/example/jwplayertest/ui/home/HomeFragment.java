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
import com.example.jwplayertest.databinding.FragmentHomeBinding;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    ArrayList vidData = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        HomeViewModel homeViewModel =
//                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);


        vidData.add(new VideoItem("Nreal sdk","Bird 1", "https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/im1.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
        vidData.add(new VideoItem("Holo 2","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img3.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
        vidData.add(new VideoItem("Abx 3","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img4.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
        vidData.add(new VideoItem("AR","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img5.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
        vidData.add(new VideoItem("MR","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img6.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
        vidData.add(new VideoItem("Apps","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img7.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
        vidData.add(new VideoItem("nreal","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img8.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
        vidData.add(new VideoItem("MR","Bird 1","https://firebasestorage.googleapis.com/v0/b/nrealsrg.appspot.com/o/img9.jpg?alt=media&token=35b36435-5077-469a-a7a6-38e7d93ee034"));
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