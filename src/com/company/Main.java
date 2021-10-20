package com.company;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();

        int[] bars1 = {9, 0, 5, 7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        int[] bars2 = {6, 0, 5, 7, 0, 4, 2, 5, 0, 6, 4, 0, 5};

//        System.out.println("largest number: " + client.largest(bars1) + " index of it: " + client.getIndexOfLargest(bars1));
//        System.out.println("second largest number: " + client.getSecondLargest(bars1) + " index of it: " + client.getIndexOfSecondLargest(bars1));
        client.showWater(bars2);
    }


}
