package com.company;

public class g14_SetBits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBit(n));
    }

    private static int setBit(int n){
        int count = 0;

//        while (n>0){
//            count++;
//            n -= (n & -n);
//        }

        while (n>0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
//time space complexity log(N)
