package com.saurabh;

import java.util.Arrays;

public class OverloadingFunctionMethod {
    public static void main(String[] args) {
        fun (76);
        fun (" saurabh munghate");
        int ans = sum(4, 5 , 8 );
        System.out.print( ans);
        demo("saurabh", "rahul");
        demo(4,5);
    }
     static void demo(int ...v){
            System.out.println(Arrays.toString(v));
        }
        static void demo(String ...v){
            System.out.println(Arrays.toString(v));
        }


    static int sum(int a, int b){
        return a + b ;
    }

    static int sum(int a, int b , int c){
        return a + b + c ;

}
    static void fun(int a){
        System.out.print("first one ");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.print("second one ");
        System.out.println(name);
    }
}

