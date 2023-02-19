package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frlFragment, FirstFragment.class, null)
                .commit();

        Button btnFragment1 = (Button) findViewById(R.id.btnFragment1);
        Button btnFragment2 = (Button) findViewById(R.id.btnFragment2);

        btnFragment1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frlFragment, FirstFragment.class, null)
                        .commit();
            }
        });

        btnFragment2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frlFragment, SecondFragment.class, null)
                        .commit();
            }
        });




    }
}