package com.example.names_paul.edinburghthingstodo;

import java.util.ArrayList;

/**
 * Created by names-paul on 30/05/2018.
 */

public class TopAttractions {


    private ArrayList<Attraction> list;

    public TopAttractions(){
        list = new ArrayList<Attraction>();
        list.add(new Attraction("Sunset Arthur's Seat", 10));
        list.add(new Attraction("Meeting Tourists at Edinburgh Castle", 4));
        list.add(new Attraction("Picnic on Crammond Island", 9));
        list.add(new Attraction("Ice Cream on Calton Hill", 8));
        list.add(new Attraction("BBQ at the Meadows", 8));

    }
}
