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
       // int n=scanner.nextInt();
        //int[] arr= scanner.

        //int[] arr = {1,2,3,4,5};
       // Reversearray reversearray = new Reversearray();
//        reversearray.reverseArray(arr);
//        System.out.println("Enter the value of a: ");
//        int a=scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Enter the value of b");
//        int b=scanner.nextInt();
//        scanner.nextLine();
////        System.out.println("Enter the value of b");
//        MiniumElementInArray minelement= new MiniumElementInArray();
//        minelement.minmumValuInArray(a,b);
        int[] arr={1,2,10,0,22,12};
        MiniumElementInArray minElement=new MiniumElementInArray();
        minElement.minmumValuInArray(arr);
    }
}