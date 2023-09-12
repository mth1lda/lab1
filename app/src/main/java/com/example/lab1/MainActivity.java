package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView group, name;
    private ImageView btrimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        group=findViewById(R.id.group);
        name=findViewById(R.id.name);
        btrimg=findViewById(R.id.btrimg);
    }

    public void hide_text (View view) {

        if (group.getVisibility()==View.VISIBLE) {
            group.setVisibility(View.INVISIBLE);
            name.setVisibility(View.INVISIBLE);
        }
        else {
            group.setVisibility(View.VISIBLE);
            name.setVisibility(View.VISIBLE);
        }
    }

//    public void hide_text (View view) {
//
//        if (group.getVisibility()==View.VISIBLE) {
//            group.setVisibility(View.INVISIBLE);
//            name.setVisibility(View.INVISIBLE);
//        }
//        else {
//            group.setVisibility(View.VISIBLE);
//            name.setVisibility(View.VISIBLE);
//        }
//
//        if (name.getVisibility()==View.VISIBLE) {
//            name.setVisibility(View.INVISIBLE);
//        }
//        else {
//            name.setVisibility(View.VISIBLE);
//        }
//    }

    public void hide_img (View view) {

        if (btrimg.getVisibility()==View.VISIBLE) {
            btrimg.setVisibility(View.INVISIBLE);
        }
        else {
            btrimg.setVisibility(View.VISIBLE);
        }
    }
}