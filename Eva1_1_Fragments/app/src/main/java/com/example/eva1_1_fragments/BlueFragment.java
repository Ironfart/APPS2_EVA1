package com.example.eva1_1_fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class BlueFragment extends Fragment {

    Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        this.context = context;
        //Log.wtf("Blue","onAttach");

        Toast.makeText(context, "onAttach", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.wtf("Blue","onCreate");

        Toast.makeText(context, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.wtf("Blue","onCreateView");
        // Inflate the layout for this fragment

        Toast.makeText(context, "onCreateView", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_blue, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.wtf("Blue","onStart");
        Toast.makeText(context, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();

        Log.wtf("Blue","onResume");

        Toast.makeText(context, "onResume", Toast.LENGTH_SHORT).show();
    }
}
