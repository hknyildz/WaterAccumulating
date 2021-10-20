package com.company;

public class Client {


    static int water = 0;

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

    public int getIndexOfLargest(int[] bars, int startIndex, int endIndex) {
        int largestNumber = bars[startIndex];
        int largestIndex = startIndex;

        for (int i = startIndex; i <= endIndex; i++) {
            if (bars[i] > largestNumber) {
                largestNumber = bars[i];
                largestIndex = i;
            }
        }
        return largestIndex;
    }

    public int getIndexOfSecondLargest(int[] bars, int startIndex, int endIndex, int indexOfLargest) {

        int largestNumber;
        int secondLargestIndex;

        if (indexOfLargest == startIndex) {
            largestNumber = bars[startIndex + 1];
            secondLargestIndex = startIndex + 1;
        } else {
            largestNumber = bars[startIndex];
            secondLargestIndex = startIndex;
        }

        for (int i = startIndex; i <= endIndex; i++) {
            if (i == indexOfLargest) {
                continue;
            } else if (bars[i] > largestNumber) {
                largestNumber = bars[i];
                secondLargestIndex = i;
            }
        }
        return secondLargestIndex;

    }

    public int countWater(int[] bars, int startIndex, int endIndex) {

        if (Math.abs(startIndex - endIndex) <= 1) {
            return 0;
        }

        int indexOfLargest = getIndexOfLargest(bars, startIndex, endIndex);
        int indexOfSecondLargest = getIndexOfSecondLargest(bars, startIndex, endIndex, indexOfLargest);
        System.out.println("İndex of max:" + indexOfLargest + " index of second max: " + indexOfSecondLargest + " Current Water=" + water);

        if (indexOfLargest > indexOfSecondLargest) {
            for (int i = indexOfLargest - 1; i > indexOfSecondLargest; i--) {
                water += bars[indexOfSecondLargest] - bars[i];
            }
            water += countWater(bars, startIndex, indexOfSecondLargest);
            water += countWater(bars, indexOfLargest, endIndex);
        } else {
            for (int i = indexOfLargest + 1; i < indexOfSecondLargest; i++) {
                water += bars[indexOfSecondLargest] - bars[i];
            }
            water += countWater(bars, startIndex, indexOfLargest);
            water += countWater(bars, indexOfSecondLargest, endIndex);

        }
        return water;
    }

    public void showWater(int[] bars) {
        int water = countWater(bars, 0, bars.length - 1);
        System.out.println("Needed waters amount is = " + water);
    }

}
