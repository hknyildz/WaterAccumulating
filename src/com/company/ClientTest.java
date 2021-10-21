package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTest {

    Client client = new Client();
    int[] bars1 = {0, 1, 9, 0, 5, 7, 0, 11,11, 2, 11, 0, 6, 4, 0, 9, 9, 9, 9, 1, 1, 0};
    int[] bars2 = {6, 0, 5, 7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
    int[] bars3 = {1, 0, 3, 0, 5, 0, 7, 0, 9, 0, 11, 0, 9, 0, 7, 0, 5, 0, 3, 0, 1};
    int[] bars4 = {200,200, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
    int[] bars5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] bars6 = {1, 13, 0, 3, 0, 5, 0, 7, 0, 9, 0, 13, 0, 9, 0, 7, 0, 5, 0, 3, 0, 1};

    @Test
    public void countWater() {

        assertEquals(client.getNeededWater(bars1), 59);
        assertEquals(client.getNeededWater(bars2), 32);
        assertEquals(client.getNeededWater(bars3), 50);
        assertEquals(client.getNeededWater(bars4), 9);
        assertEquals(client.getNeededWater(bars5), 0);
        assertEquals(client.getNeededWater(bars6), 118);

    }


}