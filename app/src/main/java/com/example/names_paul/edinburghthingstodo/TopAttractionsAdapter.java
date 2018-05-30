package com.example.names_paul.edinburghthingstodo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by names-paul on 30/05/2018.
 */

public class TopAttractionsAdapter extends ArrayAdapter<Attraction> {

    public TopAttractionsAdapter(Context context, ArrayList<Attraction> attractions){
        super(context, 0, attractions);
    }

    @Override
    public View getView(int postion, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.attractions_item, parent, false);
        }

        Attraction currentAttraction = getItem(postion);

        TextView title = listItemView.findViewById(R.id.title);
        title.setText(currentAttraction.getActivity());

        TextView rating = listItemView.findViewById(R.id.rating);
        rating.setText(currentAttraction.getRating().toString());

        return listItemView;

    }
}
