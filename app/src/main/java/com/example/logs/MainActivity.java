package com.example.logs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        String i[]=new String[3];
        i[0]="hi";
        i[1]="Hello";
        i[2]="Hola";
        Random r=new Random();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=r.nextInt(3-0)+0;
                Log.i("Hi",i[num]);

            }
        });
    }
}