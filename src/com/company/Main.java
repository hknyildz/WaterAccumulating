package com.company;

public class Main {

    public static void main(String[] args) {

        test client = new test();

        int[] bars1 = {7, 0, 8, 2, 5, 6, 9, 4, 0, 5};
        int[] bars2 ={4,0,3};

        System.out.println(client.largest(bars1));
        System.out.println("largest number: "+client.largest(bars1)+" index of it: "+client.indexOfLargest(bars1));
        System.out.println("second largest number: "+client.getSecondLargest(bars1)+" index of it: "+client.getIndexOfSecondLargest(bars1));
    }


}
