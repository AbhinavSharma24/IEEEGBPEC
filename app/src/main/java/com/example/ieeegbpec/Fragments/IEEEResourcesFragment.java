package com.example.ieeegbpec.Fragments;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ieeegbpec.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IEEEResourcesFragment extends Fragment {


    public IEEEResourcesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ieeeresources, container, false);
    }

}
