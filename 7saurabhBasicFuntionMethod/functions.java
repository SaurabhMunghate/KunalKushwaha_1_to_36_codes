package com.saurabh;

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {

//        int ans=sum2();
//        System.out.println(ans);
//    }
//             # return the value
//    static int sum2(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter number 1 :");
//        System.out.println("enter number 2 : ");
//        int num2 = in.nextInt();
//        int sum = num1 + num2 ;
//        return  sum ; }
//        int num1 = in.nextInt();


//    String message = greet();
//        System.out.println(message);
//    }
//    static String greet (){
//        String greeting = "how are you";
//        return  greeting; }


//        int ans = sum2();
//        System.out.println(ans);
//    }
//    static int sum2() {
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter number 1 :");
//        int num1 = in.nextInt();
//        System.out.println("enter number 2 :");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        return  sum ;
        //   System.out.println("this will never execute");


//            String message = greet();
//           System.out.println(message);
//          }
//         static String greet(){
//         String greeting = "how are you";
//         return greeting; }


        int ans = add3(20, 30);
        System.out.println(ans);
      }
     static int add3(int n, int m) {
        int add = n + m;
        return  add;}

//        Scanner in = new Scanner((System.in));
//        System.out.println("enter your name :");
//        String name = in.next();
//        String personalised = myGreet (name);
//        System.out.println(personalised);
//    }
//    static String myGreet(String name){
//        String message = "hello " + name ;
//        return  message ;
//    }
//    static String greet(){
//        String greeting ="how are you";
//        return  greeting;


//        int a = 10 ;
//        int b = 20 ;
//         # swap number code
//        int temp = a;
//        a= b ;
//        b = temp ;
//        System.out.println(a +" " + b );


//        String name = "saurabh munghate";
//        greet(name);
//    }
//    static void greet(String naam){
//        System.out.println(naam);


    {    int a = 10 ;
        int b = 20 ;
        {
           // int a = 78 ; // alerady initialised outside the block in the same method , hence you can not initialised again
            a = 100 ; // reassign the origin ref
            System.out.println(a);
            int c = 99 ;
            // values initialised in the block , will remain in block
        }
        System.out.println(a);
       // System.out.println(c); //n can not use outside the block
            }
            static void random (int marks){
        int num = 67;
                System.out.println(num);
                System.out.println(marks);
            }
    }







