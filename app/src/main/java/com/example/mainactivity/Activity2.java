package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    Button  A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        A = (Button) findViewById(R.id.A);
        A.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){


            }
        });
    }
    }
