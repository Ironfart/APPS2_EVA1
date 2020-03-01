package com.example.eva1_6_transiciones;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //estas se ponen antes del setContentView
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        //getWindow().setAllowEnterTransitionOverlap(true);
        getWindow().setEnterTransition(new Fade().setDuration(500));
        setContentView(R.layout.activity_main);

        intent = new Intent(this, SecondActivity.class);
    }

    public void onClick(View v){
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
}
