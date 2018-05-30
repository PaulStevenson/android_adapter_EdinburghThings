package com.example.names_paul.edinburghthingstodo;

/**
 * Created by names-paul on 30/05/2018.
 */

public class Attraction {

    private String activity;
    private Integer rating;

    public Attraction(String activity, int rating){
        this.activity = activity;
        this.rating = rating;
    }

    public String getActivity() {
        return this.activity;
    }

    public Integer getRating() {
        return this.rating;
    }
}
