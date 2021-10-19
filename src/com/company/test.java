package com.company;

public class test {


    public int getSecondLargest(int[] bars) {
        int temp;

        int secondLargestIndex = 1;

        int i;

        int largestNumber = bars[0];

        for (i = 1; i < bars.length; i++) {
            if (bars[i] > largestNumber) {
                largestNumber = bars[i];
            }
        }
        System.out.println(largestNumber);
        int secondLargestNumber = 0;

        for (int k = 0; k < bars.length; k++) {
            for (int j = k + 1; j < bars.length; j++) {
                if (bars[k] > bars[j] && bars[k] < largestNumber && bars[k] > secondLargestNumber) {
                    secondLargestNumber = bars[k];
                    k=secondLargestIndex;
                }
            }
        }
        return secondLargestNumber;
    }
    public int getIndexOfSecondLargest(int[] bars) {
        int temp;

        int secondLargestIndex = 1;

        int i;

        int largestNumber = bars[0];


        for (i = 1; i < bars.length; i++) {
            if (bars[i] > largestNumber) {
                largestNumber = bars[i];

            }
        }
        System.out.println(largestNumber);
        int secondLargestNumber = 0;

        for (int k = 0; k < bars.length; k++) {
            for (int j = k + 1; j < bars.length; j++) {
                if (bars[k] > bars[j] && bars[k] < largestNumber && bars[k] > secondLargestNumber) {
                    secondLargestNumber = bars[k];
                    secondLargestIndex=k;
                }
            }
        }
        return secondLargestIndex;
    }

    public int largest(int[] bars) {

        int i;

        int max = bars[0];

        for (i = 1; i < bars.length; i++) {
            if (bars[i] > max) {
                max = bars[i];

            }
        }
        return max;
    }

    public int indexOfLargest(int[] bars) {

        int i;

        int max = bars[0];
        int largestIndex = 1;

        for (i = 1; i < bars.length; i++) {
            if (bars[i] > max) {
                max = bars[i];
                largestIndex = i;
            }
        }


        return largestIndex;
    }



}
