package com.company;

public class Main {

    public static void main(String[] args) {

        test client = new test();

        int[] bars1 = {7, 0, 4, 2, 5, 6, 9, 4, 0, 5};
        int[] bars2 ={4,0,3};

        System.out.println(client.largest(bars1));

        System.out.println(client.getSecondLargest(bars1, bars1.length));
        client.fill(bars2, bars2.length);
    }


}
