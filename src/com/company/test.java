package com.company;

public class test {


    public int getSecondLargest(int[] bars) {

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
                    k = secondLargestIndex;
                }
            }
        }
        return secondLargestNumber;
    }

    public int getIndexOfSecondLargest(int[] bars) {

        int secondLargestIndex = 0;

        int largestNumber = bars[0];


        for (int i = 0; i < bars.length - 1; i++) {
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
                    secondLargestIndex = k;
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

    public int getIndexOfLargest(int[] bars) {


        int max = bars[0];
        int largestIndex = 0;

        for (int i = 1; i < bars.length; i++) {
            if (bars[i] > max) {
                max = bars[i];
                largestIndex = i;
            }
        }
        return largestIndex;
    }


    public int countWater(int[] bars) {
        int water = 0;
        int max1 = getIndexOfLargest(bars);
        int max2 = getIndexOfSecondLargest(bars);
        System.out.println("İndex of max:" + max1 + " index of second max: " + max2);
        System.out.println("********************courrent array is***************");
        for (int i = 0; i < bars.length; i++) {
            System.out.println("bars[" + i + "]= " + bars[i]);
        }
        if (max1 > max2) {
            for (int i = max1 - 1; i > max2; i--) {
                water += bars[max2] - bars[i];
                bars[i] += max2 - bars[i];
            }
        } else {
            for (int i = max1 + 1; i < max2; i++) {
                water += bars[max2] - bars[i];
                bars[i] += max2 - bars[i];

            }
            bars[max1] = bars[max2];
            countWater(bars);
        }
        System.out.println("İndex of max:" + max1 + " index of second max: " + max2);
        for (int i = 0; i < bars.length; i++) {
            System.out.println("bars[" + i + "]= " + bars[i]);
        }

        return water;
    }


}
