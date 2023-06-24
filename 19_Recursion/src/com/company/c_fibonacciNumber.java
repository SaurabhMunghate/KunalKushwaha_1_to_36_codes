package com.company;

public class c_fibonacciNumber {
    public static void main(String[] args) {
        int ans = fibo(500);
        System.out.println(ans);
    }
    static int fibo(int n){
        //base condition
        if (n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}


/*
break it down into smaller problems
the base condition is represented by answers we already have
- recursive tree
Note :-
 */