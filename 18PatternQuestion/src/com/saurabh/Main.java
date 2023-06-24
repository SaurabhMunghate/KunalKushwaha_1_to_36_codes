package com.saurabh;

public class Main {

    public static void main(String[] args) {
    pattern(5);
    }

    static void pattern(int n){
        for (int row = 0; row <= n; row++) {

            for (int col = row; col >= 1 ; col--) {
                System.out.print(n-col+1 + " ");
            }
            for (int space = 0; space < n-row; space++) {
                System.out.print("  "
                );
            }
//            System.out.print("* ");
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print(n-col+1 + " ");
            }
            System.out.println();
        }
    }
}
