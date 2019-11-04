package com.example.ieeegbpec.Fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.ieeegbpec.Activities.EventActivity;
import com.example.ieeegbpec.R;
import com.squareup.picasso.Picasso;

import java.util.Objects;

public class EventsFragment extends Fragment {

    @SuppressLint("InflateParams")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_events, null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9;

        imageView1 = view.findViewById(R.id.event1);
        imageView2 = view.findViewById(R.id.event2);
        imageView3 = view.findViewById(R.id.event3);
        imageView4 = view.findViewById(R.id.event4);
        imageView5 = view.findViewById(R.id.event5);
        imageView6 = view.findViewById(R.id.event6);
        imageView7 = view.findViewById(R.id.event7);
        imageView8 = view.findViewById(R.id.event8);
        imageView9 = view.findViewById(R.id.event9);


        /*Picasso.get().load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event1.jpg?raw=true")
                .centerCrop().fit().placeholder(R.drawable.loading4).into(imageView1);
        Picasso.get().load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event2.jpeg?raw=true")
                .centerCrop().fit().placeholder(R.drawable.loading4).into(imageView2);
        Picasso.get().load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event3%20-%20Copy.png?raw=true")
                .centerCrop().fit().placeholder(R.drawable.loading4).into(imageView3);
        Picasso.get().load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event4.jpg?raw=true")
                .centerCrop().fit().placeholder(R.drawable.loading4).into(imageView4);
        Picasso.get().load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event5.jpg?raw=true")
                .centerCrop().fit().placeholder(R.drawable.loading4).into(imageView5);
        Picasso.get().load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event6.jpg?raw=true")
                .centerCrop().fit().placeholder(R.drawable.loading4).into(imageView6);
        Picasso.get().load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event7%20-%20Copy.png?raw=true")
                .centerCrop().fit().placeholder(R.drawable.loading4).into(imageView7);
        Picasso.get().load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event8_2.jpg?raw=true")
                .centerCrop().fit().placeholder(R.drawable.loading4).into(imageView8);
        Picasso.get().load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event9_2.png?raw=true")
                .centerCrop().fit().placeholder(R.drawable.loading4).into(imageView9);*/


        Glide.with(Objects.requireNonNull(getActivity())).load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event1.jpg?raw=true")
                .fitCenter().placeholder(R.drawable.loading4).into(imageView1);
        Glide.with(Objects.requireNonNull(getActivity())).load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event2.jpeg?raw=true")
                .fitCenter().placeholder(R.drawable.loading4).into(imageView2);
        Glide.with(Objects.requireNonNull(getActivity())).load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event3%20-%20Copy.png?raw=true")
                .fitCenter().placeholder(R.drawable.loading4).into(imageView3);
        Glide.with(Objects.requireNonNull(getActivity())).load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event4.jpg?raw=true")
                .fitCenter().placeholder(R.drawable.loading4).into(imageView4);
        Glide.with(Objects.requireNonNull(getActivity())).load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event5.jpg?raw=true")
                .fitCenter().placeholder(R.drawable.loading4).into(imageView5);
        Glide.with(Objects.requireNonNull(getActivity())).load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event6.jpg?raw=true")
                .fitCenter().placeholder(R.drawable.loading4).into(imageView6);
        Glide.with(Objects.requireNonNull(getActivity())).load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event7%20-%20Copy.png?raw=true")
                .fitCenter().placeholder(R.drawable.loading4).into(imageView7);
        Glide.with(Objects.requireNonNull(getActivity())).load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event8_2.jpg?raw=true")
                .fitCenter().placeholder(R.drawable.loading4).into(imageView8);
        Glide.with(Objects.requireNonNull(getActivity())).load("https://github.com/AbhinavSharma24/CBdemoHacktoberFest/blob/master/event9_2.png?raw=true")
                .fitCenter().placeholder(R.drawable.loading4).into(imageView9);


        final CardView cardView1 = view.findViewById(R.id.card1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "1");
                startActivity(intent);
            }
        });

        final CardView cardView2 = view.findViewById(R.id.card2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "2");
                startActivity(intent);
            }
        });

        final CardView cardView3 = view.findViewById(R.id.card3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "3");
                startActivity(intent);
            }
        });

        final CardView cardView4 = view.findViewById(R.id.card4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "4");
                startActivity(intent);
            }
        });

        final CardView cardView5 = view.findViewById(R.id.card5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "5");
                startActivity(intent);
            }
        });

        final CardView cardView6 = view.findViewById(R.id.card6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "6");
                startActivity(intent);
            }
        });

        final CardView cardView7 = view.findViewById(R.id.card7);
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "7");
                startActivity(intent);
            }
        });

        final CardView cardView8 = view.findViewById(R.id.card8);
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "8");
                startActivity(intent);
            }
        });

        final CardView cardView9 = view.findViewById(R.id.card9);
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "9");
                startActivity(intent);
            }
        });
    }
}
