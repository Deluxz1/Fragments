package com.example.tjss.frg1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Frgtwo extends Fragment {

    public Frgtwo() {
    }

    public static Frgtwo newInstance() {
        Frgtwo fragment = new Frgtwo();
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_frgtwo, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.tv1);
        textView.setText("Welcome to page two");
        return rootView;
    }
}