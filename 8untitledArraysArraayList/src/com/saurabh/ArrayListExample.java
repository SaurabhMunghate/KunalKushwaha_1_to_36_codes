package com.saurabh;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        // syntax :
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(56);
//        list.add(346);
//        list.add(87);
//        list.add(22);
//        list.add(45);
//        list.add(67);
//        list.add(45);
//        list.add(98);
//        list.add(11);
//        list.add(22);
//
////        System.out.println(list.contains(22));
//        System.out.println(list);
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);

        // input :
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get item at any index :
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here , list [index] syntax will not here
        }
//        System.out.println(list);
    }
}
