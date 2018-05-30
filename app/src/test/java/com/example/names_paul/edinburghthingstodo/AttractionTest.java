package com.example.names_paul.edinburghthingstodo;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;

/**
 * Created by names-paul on 30/05/2018.
 */

public class AttractionTest {

    Attraction attraction;

    @Before
    public void before(){
        attraction = new Attraction("Zorbing at Rolling Haggis", 7);
    }

    @Test
    public void hasActivity(){
        assertEquals("Zorbing at Rolling Haggis", attraction.getActivity());
    }

    @Test
    public void hasRating(){
        assertEquals(7, attraction.getRating());
    }



}
