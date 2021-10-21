package com.company;

public class Client {


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
        int water = 0;
        int indexOfLargest = getIndexOfLargest(bars, startIndex, endIndex);
        int indexOfSecondLargest = getIndexOfSecondLargest(bars, startIndex, endIndex, indexOfLargest);

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

    public int getNeededWater(int[] bars) {
        return countWater(bars, 0, bars.length - 1);
    }

}
