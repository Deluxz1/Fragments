package com.example.tjss.frg1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Frgone extends Fragment implements View.OnClickListener {

    private int mcount = 0;
    private TextView mtextview;
    private Button button;
    public Frgone() {
    }

    public static Frgone newInstance() {
        Frgone fragment = new Frgone();
        return fragment;

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_frgone, container, false);
        button = rootView.findViewById(R.id.bt1);
        mtextview = rootView.findViewById(R.id.tv1);
        mtextview.setText("0");
        button.setOnClickListener(this);


        return rootView;
    }

    @Override
    public void onClick(View view) {
       mtextview.setText(""+(++mcount));
    }
}