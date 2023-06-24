package com.company;

import java.util.Arrays;

public class b25_Triangle {
    public static void main(String[] args) {
        triangle(4,0);
        triangle2(4,0);
        int[] arr ={4,3,2,1};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

        int[] arrr = {4,3,9,6,8,1};
        selection(arrr,arrr.length,0,0);
        System.out.println(Arrays.toString(arrr));
    }
    static void triangle(int r , int c){
        if (r == 0){
            return;
        }
        if (c < r){
            System.out.print("*");
            triangle(r,c+1);
        }else {
            System.out.println();
            triangle(r-1,0);
        }
    }
    static void triangle2(int r , int c){
        if (r == 0){
            return;
        }
        if (c < r){
            triangle2(r,c+1);
            System.out.print("*");
        }else {
            triangle2(r-1,0);
            System.out.println();
        }
    }
    static void bubble(int[] arr , int r , int c){
        if (r == 0){
            return;
        }
        if (c < r){
            if (arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp ;
            }
            bubble(arr,r,c+1);
        }else {
            System.out.println();
            bubble(arr,r-1,0);
        }
    }
    static void selection(int[] arrr ,int r , int c , int max ){
        if (r == 0){
            return;
        }
        if (c < r){
            if (arrr[c] > arrr[max]) {
                selection(arrr, r, c + 1, c);
            }else {
                selection(arrr , r , c + 1 , max);
            }
        }else {
            int temp = arrr[max];
            arrr[max] = arrr[r-1];
            arrr[r-1] = temp ;
            selection(arrr , r-1,0,0);
        }
    }
}
