package com.saurabh;

import java.util.Arrays;

public class OutputString {
    public static void main(String[] args) {
        System.out.println(56);  // out is a variable of type PrintStream , PrintStream (class) has a method of println
        System.out.println("Saurabh");

        Integer num = new Integer(56);  // Wrapper class  : in Wrapper class we can do many think what wee want
        System.out.println(num.toString());  // wrapper in an object :
        System.out.println(num);

//        System.out.println(new int [] {2 ,3, 4, 4});    // object arr
        System.out.println(Arrays.toString(new int[]{2, 3, 4, 4}));

        String name = null ;
        System.out.println(name);
    }
}
