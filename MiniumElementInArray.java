package com.anjali;

public class MiniumElementInArray {
    public void minmumValuInArray(int[] myArr) {
        int i;
        int min = myArr[0];
        for (i = 1; i < myArr.length; i++) {
            if (myArr[i] < min)
                min = myArr[i];
        }
        System.out.println("Smallest element of the Array:" +min);
    }
}