package com.example.names_paul.edinburghthingstodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class AttractionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        Intent intent = getIntent();
        Attraction attraction = (Attraction) intent.getSerializableExtra("attraction");
        Log.d("AttractionActivity: ", attraction.getActivity());
    }
}
