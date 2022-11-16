package com.sameh.mvvm.ui;


import androidx.appcompat.app.AppCompatActivity;

import androidx.lifecycle.ViewModelProviders;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.sameh.mvvm.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    OprViewModel oprViewModel;

    ActivityMainBinding binding;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        oprViewModel = new OprViewModel();

        oprViewModel = ViewModelProviders.of(this).get(OprViewModel.class);

        // Mutable for Plus
        oprViewModel.mutablePlusLiveData.observe(this, integer -> binding.plusResultTextView.setText(integer.toString()));
        // Mutable for Div
        oprViewModel.mutableDivLiveData.observe(this, integer -> binding.divResultTextView.setText(integer.toString()));
        // Mutable for Multi
        oprViewModel.mutableMultiLiveData.observe(this, integer -> binding.mulResultTextView.setText(integer.toString()));

        // Listener for Plus
        binding.plusButton.setOnClickListener(view -> oprViewModel.getPlusResult());
        // Listener for Div
        binding.divButton.setOnClickListener(v -> oprViewModel.getDivResult());
        // Listener for Multi
        binding.mulButton.setOnClickListener(v -> oprViewModel.getMultiResult());

    }
}