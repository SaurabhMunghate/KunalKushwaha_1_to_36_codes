package com.company;

public class a_oddEven {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(isOdd(n));
    }
    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
