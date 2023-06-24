package com.saurabh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgsFunctionMethods {
    public static void main(String[] args) {
//        fum ();
        multiple(2 , 3 , "saurabh","munghate");
        demo(2,4,3);
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a , int b , String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
