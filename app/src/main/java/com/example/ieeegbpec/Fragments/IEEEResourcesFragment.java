package com.example.ieeegbpec.Fragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ieeegbpec.R;
import com.squareup.picasso.Picasso;

public class IEEEResourcesFragment extends Fragment {

    public IEEEResourcesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ieeeresources, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView image1, image2, image3, image4;

        image1 = view.findViewById(R.id.resources1);
        image2 = view.findViewById(R.id.resources2);
        image3 = view.findViewById(R.id.resources3);
        image4 = view.findViewById(R.id.resources4);

        Picasso.get().load("https://qph.fs.quoracdn.net/main-qimg-667f768690129bc1910c870510767f45.webp").fit().centerCrop().into(image1);
        Picasso.get().load("http://www.ek.szte.hu/wp-content/uploads/2018/03/28795591_10155122752357312_3051896353524382187_n.jpg").fit().centerCrop().into(image2);
        Picasso.get().load("https://transmitter.ieee.org/wp-content/uploads/2019/07/share.png").fit().centerCrop().into(image3);
        Picasso.get().load("https://image.slidesharecdn.com/resumelabstudents-140803091359-phpapp01/95/resume-lab-students-1-638.jpg?cb=1407057250").fit().centerCrop().into(image4);

        CardView card1, card2, card3, card4;

        card1=view.findViewById(R.id.Rcard1);
        card2=view.findViewById(R.id.Rcard2);
        card3=view.findViewById(R.id.Rcard3);
        card4=view.findViewById(R.id.Rcard4);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ieee-collabratec.ieee.org/"));
                startActivity(intent);
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ieeexplore.ieee.org/Xplore/home.jsp"));
                startActivity(intent);
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://transmitter.ieee.org/"));
                startActivity(intent);
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ieee.org/membership/products/resumelab.html"));
                startActivity(intent);
            }
        });
    }
}
