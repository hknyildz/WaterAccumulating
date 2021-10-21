package com.company;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();

        int[] bars1 = {0,1,9, 0, 5, 7, 0, 11, 2, 11, 0, 6, 4, 0, 9,9,9,9,1,1,0};
        int[] bars2 = {6, 0, 5, 7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        int[] bars3 = {1,13,0,3,0,5,0,7,0,9,0,13,0,9,0,7,0,5,0,3,0,1};

        System.out.println("Needed water is: "+client.getNeededWater(bars3));
    }


}
