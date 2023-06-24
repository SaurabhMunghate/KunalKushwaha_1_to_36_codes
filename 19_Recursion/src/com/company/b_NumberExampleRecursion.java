package com.company;

public class b_NumberExampleRecursion {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        //print first 5 numbers : 1 2 3 4 5
        print(1);
    }
    static void print(int n){
        if(n == 5){           // base condition in recursion : condition where are recursion stop making new call
            System.out.println(5); // stack will be filled again and again
            return;
        }
        System.out.println(n);
        /*
        recursive call
        if you are calling a function again and again , you can treat it as a separate call in the stack
        this is called tail recursion
        this is the last function call
         */
        print(n + 1);
    }
}
/*
every call of function will take some memory of computer will excite the memory
stack overflow error
- recursion function calling itself
- it helps us in solving bigger / complex problems in a simple way
- you can convert recursion solution into iteration (loop) and vive versa
- space completing
- it helps  us  in braking bigger problem into smaller problem
 */