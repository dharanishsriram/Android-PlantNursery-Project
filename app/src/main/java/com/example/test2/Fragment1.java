package com.example.test2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class Fragment1 extends Fragment {

    TextView tv3,ed2;
    MultiAutoCompleteTextView mul;
    Button b1;
    String st1,st2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_1,container,false);
        tv3=v.findViewById(R.id.textView3);
        mul=v.findViewById(R.id.mult);




        return inflater.inflate(R.layout.fragment_1, container, false);
    }
}