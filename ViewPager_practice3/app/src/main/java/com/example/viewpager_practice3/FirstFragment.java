package com.example.viewpager_practice3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {
    //private int page;

    public static ThirdFragment newInstance(/*int page*/){
        ThirdFragment fragment = new ThirdFragment();
        /*Bundle args = new Bundle();
        args.putInt("someInt", page);
        fragment.setArguments(args);*/
        return fragment;
    }

    /*public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
    }*/

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        return view;
    }

}
