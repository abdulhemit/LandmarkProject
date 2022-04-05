package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.landmarkbook.databinding.ActivityDetailsBinding;

public class Details extends AppCompatActivity {
    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        //Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("landmark");

        Singleton singleton = Singleton.getInstance();
        Landmark selectedLandmark = singleton.getSelectedLandmark();

        binding.Name.setText(selectedLandmark.name);
        binding.Country.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);


    }
}