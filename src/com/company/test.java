package com.company;

public class test {



    public int getSecondLargest(int[] bars, int total){
        int temp;
        int secondLargestIndex=1;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (bars[i] > bars[j])
                {
                    temp = bars[i];
                    bars[i] = bars[j];
                    bars[j] = temp;
                }
            }
        }
        return bars[total-2];
    }


    public int largest(int[] bars){

        int i;

        int max = bars[0];
        int largestIndex=1;

        for (i = 1; i < bars.length; i++){
            if (bars[i] > max)

                max = bars[i];
            largestIndex=i;
        }


        return max;
    }
    public void fill(int[] bars, int total){
        int temp;
        int waterAmount=0;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (bars[i] < bars[j]){
                   waterAmount+= bars[j]-bars[i];
                }
                if (bars[i] > bars[j])
                {
                    temp = bars[i];
                    bars[i] = bars[j];
                    bars[j] = temp;
                }
            }
        }
        int secondLargest= bars[total-2];
        int Largest= bars[total-1];
        System.out.println(waterAmount);
    }

}
