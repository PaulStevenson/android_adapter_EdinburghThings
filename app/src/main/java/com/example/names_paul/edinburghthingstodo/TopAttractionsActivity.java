package com.example.names_paul.edinburghthingstodo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TopAttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attractions_list);

        TopAttractions topAttractions = new TopAttractions();
        ArrayList<Attraction> list = topAttractions.getList();

        TopAttractionsAdapter attractionAdapter = new TopAttractionsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);
    }
}
