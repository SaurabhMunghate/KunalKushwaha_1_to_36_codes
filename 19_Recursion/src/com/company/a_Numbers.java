package com.company;

public class a_Numbers {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 number : 1 2 3 4 5
        // stack and heap
        print1(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }static void print2(int n){
        System.out.println(n);
        print3(3);
    }static void print3(int n){
        System.out.println(n);
        print4(4);
    }static void print4(int n){
        System.out.println(n);
        print5(5);
    }static void print5(int n){
        System.out.println(n);
        print6(6);
    }static void print6(int n){
        System.out.println(n);
    }
}
/*
note 1 : while the function is not finished executing it will remain in stack
when a function executing it is removes  from the stack and the flow of program is restored to where that function
was called .
 */