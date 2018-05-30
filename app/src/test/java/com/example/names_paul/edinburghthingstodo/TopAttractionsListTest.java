package com.example.names_paul.edinburghthingstodo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by names-paul on 30/05/2018.
 */

public class TopAttractionsListTest {

    @Test
    public void canGetList(){
        TopAttractions topAttractions = new TopAttractions();
        assertEquals(5, topAttractions.getList().size());
    }





}
