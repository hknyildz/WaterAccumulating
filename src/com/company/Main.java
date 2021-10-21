package com.company;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();

        int[] bars1 = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};

        System.out.println("Needed water is: " + client.getNeededWater(bars1));
    }


}
