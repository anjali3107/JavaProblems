package com.anjali;

import javax.security.sasl.SaslServer;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
//        System.out.println("hello world!");
//        System.out.println("My first commit was successful");
//        System.out.println("Triangle");
//        for (int i=1;i<=4;i++) {
//            for (int j=1;j<=i;j++)
//            {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        System.out.println("Enter the Array to be reversed: ");
//        jjj
        int[] arr = {1,2,3,4,5};
        Reversearray reversearray = new Reversearray();
        reversearray.reverseArray(arr);
    }
}