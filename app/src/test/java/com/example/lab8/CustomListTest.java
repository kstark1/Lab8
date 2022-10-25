package com.example.lab8;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        // check that the new size of the list is the initial size + 1
        assertEquals(list.getCount(), listSize + 1);
        // adding another line
    }


}
