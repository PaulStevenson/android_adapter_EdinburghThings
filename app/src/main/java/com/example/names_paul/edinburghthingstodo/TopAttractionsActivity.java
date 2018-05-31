package com.example.names_paul.edinburghthingstodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

    public void onListItemClick(View listItem){
        Attraction attraction = (Attraction) listItem.getTag();
        Log.d("Title", attraction.getActivity());

        Intent intent = new Intent (this, AttractionActivity.class);
        intent.putExtra("attraction", attraction);
        startActivity(intent);
    }
}
