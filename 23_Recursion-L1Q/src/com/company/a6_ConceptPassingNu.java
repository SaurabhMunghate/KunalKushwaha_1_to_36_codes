package com.company;

public class a6_ConceptPassingNu {
    public static void main(String[] args) {

    }
    static void fun(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        fun(n--);
//        fun(--n);
        /*
         n-- : return n first then subtract
         ans
         --n : subtract first then return n
         */

    }
}
