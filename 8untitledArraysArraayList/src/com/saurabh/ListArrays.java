package com.saurabh;

import java.util.Arrays;
import java.util.Scanner;

public class ListArrays {
    public static void main(String[] args) {
        // array of primitives
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 54;
        arr[1] = 53;
        arr[2] = 83;
        arr[3] = 23;
        arr[4] = 93;
        //[54,53,53,53,53]
        System.out.println(arr[3]);

        //input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
//        System.out.println(Arrays.toString(arr)); // simple way to write an array , best one

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
        for (int j : arr) {              // for every element in array , print the element
            System.out.println(j + " "); // here num represents element of the array
        }
//        System.out.println(arr[5]); // index out of bound error

        //## array of objects :
        String[]  str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "saurabh";
        System.out.println(Arrays.toString(str));
    }
}
