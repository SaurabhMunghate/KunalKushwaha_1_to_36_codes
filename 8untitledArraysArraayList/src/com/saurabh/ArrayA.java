package com.saurabh;

public class ArrayA {
    public static void main(String[] args) {
        //q. store a roll number
//        int a = 19 ;

        //q. store a person's name
        String name = "saurabh munghate ";

        //q . store 5 roll number
        int rno1 = 2;
        int rno2 = 65;
        int rno3 = 56;

        //syntex
        //datatype[] variable_name = new datatype[size];
        //store 5 roll numbers ;
//        int[] rnos = new int[5];
//        //or directly
//        int[] rno2 = {23,67,2,56,78}

        int[] ros ;       // declaration of array . ros is getting defined in the stack
        ros = new int[5]; // initialisation : actually here object is being created in the memory (heap)
        System.out.println(ros[5]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
        //shortcut
//        for (String element : arr ){
//            System.out.println(element);
//        }
    }
}
