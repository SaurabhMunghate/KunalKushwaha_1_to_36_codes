package com.saurabh;

import java.util.Arrays;
import java.util.Locale;

public class MethodsString {
    public static void main(String[] args) {
        //All the methods :
        String name = " Saurabh Rambhau Munghate ";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("   Saurabh     ".strip());
        System.out.println(Arrays.toString(name.split("  ")));
    }
}
