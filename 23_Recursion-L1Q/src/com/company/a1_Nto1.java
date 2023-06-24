package com.company;

public class a1_Nto1 {
    public static void main(String[] args) {
        fun(5);
        funRev(5);
        funRevBoth(5);
    }
    static void fun(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);   // 5 4 3 2 1
        fun(n-1);
    }
    static void funRev(int n){
        if (n == 0){
            return;
        }
        funRev(n-1);
        System.out.println(n);   // 1 2 3 4 5
    }
    static void funRevBoth(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        funRevBoth(n-1);
        System.out.println(n);
    }
}
