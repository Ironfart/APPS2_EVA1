package com.example.eva1_2_fragcom;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    String[] data = {
            "Enero",
            "Febrero",
            "Marzo",
            "Abril",
            "Mayonesa",
            "Macormic",
            "Hellmans",
            "Picnic",
            "Area 51",
            "Elstigirl",
            "Mister increíble",
    };

    MainActivity main;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        main = (MainActivity)getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FrameLayout frmLay = (FrameLayout) inflater.inflate(R.layout.fragment_list, container, false);

        ListView list = frmLay.findViewById(R.id.lsVwData);

        list.setAdapter(new ArrayAdapter<String>(
                main,
                android.R.layout.simple_list_item_1,
                data
        ));

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                main.onMsgFromFragToMain("Lista", data[i]);
            }
        });

        return frmLay;
    }
}
