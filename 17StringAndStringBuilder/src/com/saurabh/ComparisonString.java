package com.saurabh;

public class ComparisonString {
    public static void main(String[] args) {
        String a = "Saurabh";
        String b = "Saurabh";
        String c = a ;
        System.out.println(c == a);
        //==
//        System.out.println(a == b);

        //crating these values outside the poo but in heap
        //when you only need to chek value , use .equals method :

        String name1 = new String("Saurabh");
        String name2 = new String("Saurabh");
//        String name2 = new String("Sausdfsf");

        System.out.println(name1 == name2);  // comparator

        System.out.println(name1.equals(name2));  // method

        System.out.println(name1.charAt(0));
    }
}
