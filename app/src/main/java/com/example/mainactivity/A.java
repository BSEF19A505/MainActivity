package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class A extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        img = (ImageView) findViewById(R.id.img);
        Bundle extras = getIntent().getExtras();
        switch(extras.getChar("alphabet")) {
            case 'a':
                img.setBackgroundResource(R.drawable.a);
                break;

            case 'b':
                img.setBackgroundResource(R.drawable.b);
                break;


            case 'c':
                img.setBackgroundResource(R.drawable.c);
                break;

            case 'd':
                img.setBackgroundResource(R.drawable.d);
                break;
            case 'e':
                img.setBackgroundResource(R.drawable.e);
                break;

            case 'f':
                img.setBackgroundResource(R.drawable.f);
                break;
            case 'g':
                img.setBackgroundResource(R.drawable.g);
                break;
            case 'h':
                img.setBackgroundResource(R.drawable.h);
                break;
            case 'i':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 'j':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 'k':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 'l':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 'm':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 'n':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 'o':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 'p':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 'q':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 'r':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 's':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 't':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 'u':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 'v':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 'w':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 'x':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 'y':
                img.setBackgroundResource(R.drawable.a);
                break;
            case 'z':
                img.setBackgroundResource(R.drawable.a);
                break;


        }
}}