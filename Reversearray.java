package com.anjali;

import java.util.Arrays;

public class Reversearray {
    public void reverseArray(int[] myArr) {
        for (int i = 0, j = myArr.length - 1; i < myArr.length / 2; i++, j--) {
            int temp = myArr[i];
            myArr[i] = myArr[j];
            myArr[j] = temp;
        }
        System.out.println("Reverse of Array " + Arrays.toString(myArr));
    }
}
