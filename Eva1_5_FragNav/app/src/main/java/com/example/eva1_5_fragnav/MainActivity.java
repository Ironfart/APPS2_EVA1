package com.example.eva1_5_fragnav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        BtnFrag btnFrag = new BtnFrag();

        btnFrag.setClickLis(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
                BlankFragment blankFrag = new BlankFragment();
                ft2.replace(R.id.frmLyFrag, blankFrag);
                //ft2.addToBackStack("hola");
                ft2.commit();
            }
        });

        ft.replace(R.id.frmLyFrag, btnFrag);
        ft.commit();
    }
}
