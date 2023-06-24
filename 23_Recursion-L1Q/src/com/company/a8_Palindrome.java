package com.company;

public class a8_Palindrome {

    static int Rev(int n){
        //sometimes you might need some additional variables in the argument
        //int that case , make another function
        int digit = (int)(Math.log10(n))+1;
        return helper(n , digit);
    }
    private static int helper(int n , int digits ){
        if (n%10 == n){
            return n;
        }
        int rem = n%10 ;
        return rem * (int) (Math.pow(10 , digits - 1)) + helper(n/10 , digits - 1);
    }

    static boolean palin(int n){
        return n == Rev(n);
    }

    public static void main(String[] args) {
//        revers1(1234);
//        System.out.println(sum);
//        System.out.println(Rev(12345));
//        System.out.println(palin(1234321));
        System.out.println(palin(1));
    }
}
