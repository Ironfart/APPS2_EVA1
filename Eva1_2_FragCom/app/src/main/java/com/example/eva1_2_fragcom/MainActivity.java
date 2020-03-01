package com.example.eva1_2_fragcom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ButtonFragment btnFrag;
    ListFragment lstFrag;

    TextView txtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtData = findViewById(R.id.txtVwMsg);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment.getClass() == ButtonFragment.class) {
            btnFrag = (ButtonFragment)fragment;
        } else if (fragment.getClass() == ListFragment.class) {
            lstFrag = (ListFragment)fragment;
        }
    }
                                    //quien             que
    public void onMsgFromFragToMain(String sender, String param) {
        if (sender.equals("Lista")) {
            txtData.setText("Lista "+ param);
        } else if (sender.equals("Boton")) {
            txtData.setText("Botón " + param);
        }
    }
}
