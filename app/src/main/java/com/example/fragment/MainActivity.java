package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button firstFragmentBtn = findViewById(R.id.fragment1btn);
    Button secondFragmentBtn = findViewById(R.id.fragment2btn);

    TextView fragmentText = (TextView) findViewById(R.id.fragmentText);

    private ItemViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(ItemViewModel.class);

        viewModel.getSelectedItem().observe(this, item -> {

            fragmentText.setText((item));
        });


        firstFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}