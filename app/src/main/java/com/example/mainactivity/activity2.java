package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity2 extends AppCompatActivity {
    Button A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        A=findViewById(R.id.A);
        B=findViewById(R.id.B);
        C=findViewById(R.id.C);
        D=findViewById(R.id.D);
        E=findViewById(R.id.E);
        F=findViewById(R.id.F);
        G=findViewById(R.id.G);
        H=findViewById(R.id.H);
        I=findViewById(R.id.I);
        J=findViewById(R.id.J);
        K=findViewById(R.id.K);
        L=findViewById(R.id.L);
        M=findViewById(R.id.M);
        N=findViewById(R.id.N);
        O=findViewById(R.id.O);
        P=findViewById(R.id.P);
        Q=findViewById(R.id.Q);
        r=findViewById(R.id.R);
        S=findViewById(R.id.S);
        T=findViewById(R.id.T);
        U=findViewById(R.id.U);
        V=findViewById(R.id.V);
        W=findViewById(R.id.W);
        X=findViewById(R.id.X);
        Y=findViewById(R.id.Y);
        Z=findViewById(R.id.Z);
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity2.this,A.class);
                intent.putExtra("alphabet",'a');
                startActivity(intent);
            }
        });










    }
}