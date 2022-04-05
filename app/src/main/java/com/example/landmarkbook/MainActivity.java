package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.landmarkbook.databinding.ActivityDetailsBinding;
import com.example.landmarkbook.databinding.ActivityMainBinding;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    ArrayList<Landmark> landmarkArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        landmarkArrayList = new ArrayList<>();

        //data
        Landmark pisa = new Landmark("pisa","Italya",R.drawable.pisa);
        Landmark eiffel = new Landmark("Eiffel","Franca",R.drawable.pariskulesi);
        Landmark colosseum = new Landmark("Colosseum","Italya",R.drawable.colosseum);
        Landmark londonBridge = new Landmark("London Bridge","UK",R.drawable.londrobridge);
        Landmark ayasofya = new Landmark("Ayasofya","Turkey",R.drawable.ayasofya);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(colosseum);
        landmarkArrayList.add(londonBridge);
        landmarkArrayList.add(ayasofya);

        binding.recyclerview.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        LandAdapter landAdapter = new LandAdapter(landmarkArrayList);
        binding.recyclerview.setAdapter(landAdapter);
    }
}