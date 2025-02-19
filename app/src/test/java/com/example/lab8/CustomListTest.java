package com.example.lab8;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Test
    public void addCityTest() {
        list = new CustomList(null, new ArrayList<City>());
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCityTest() {
        list = new CustomList(null, new ArrayList<City>());
        list.addCity(new City("Edmonton", "AB"));

        assertTrue(list.hasCity(new City("Edmonton", "AB")));
        assertFalse(list.hasCity(new City("Calgary", "AB")));
    }

    @Test
    public void countCitiesTest() {
        list = new CustomList(null, new ArrayList<City>());
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.countCities(), 1);
    }

    @Test
    public void deleteCitiesTest() {
        list = new CustomList(null, new ArrayList<City>());
        list.addCity(new City("Edmonton", "AB"));
        list.deleteCities(new City("Edmonton", "AB"));
        assertEquals(list.countCities(), 0);
        assertFalse(list.hasCity(new City("Edmonton", "AB")));
    }


}
