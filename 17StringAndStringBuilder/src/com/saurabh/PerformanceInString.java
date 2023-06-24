package com.saurabh;

public class PerformanceInString {
    public static void main(String[] args) {
        String series = " ";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i );
//            System.out.println(ch);
            //another example
            series = series + ch ; // series += ch

        }
        System.out.println(series);
    }
}
