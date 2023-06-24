package com.saurabh;

import java.util.Arrays;
import java.util.Scanner;

public class InputInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr =  new int [3][];
//        int [][] arr2D = {
//                {23,23,56,87},   //0th index
//                {12,54,8},       // 1st index
//                {67,98,2,34,65}, // 2nd index -> arr2D[2] = {67,98,2,34,65}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length);// no of rows
        // input :
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //Output :
//        for (int row = 0; row < arr.length; row++) {
//            //for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + "  ");
//            }
//            System.out.println();
//    }
            // another example of output :
//            for (int row = 0; row < arr.length ; row++) {
//                System.out.println(Arrays.toString(arr[row]));
//            }

        // enhance for loop another example for output :
            for (int[] a : arr ){
                System.out.println(Arrays.toString(a));
            }
        }
    }
