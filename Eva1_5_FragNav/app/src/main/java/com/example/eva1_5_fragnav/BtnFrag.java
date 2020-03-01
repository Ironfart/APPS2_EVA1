package com.example.eva1_5_fragnav;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class BtnFrag extends Fragment {

    private View.OnClickListener clickLis;

    public void setClickLis(View.OnClickListener clickLis) {
        this.clickLis = clickLis;
    }

    public BtnFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout li = (LinearLayout) inflater.inflate(R.layout.fragment_btn, container, false);
        Button btn = li.findViewById(R.id.button2);
        btn.setOnClickListener(clickLis);

        return li;
    }

}
