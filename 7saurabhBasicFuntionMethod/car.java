package com.saurabh;

public class car {
    public static void main(String[] args) {
        PracticeSection myCar1 = new PracticeSection();
        PracticeSection myCar2 = new PracticeSection();
//        System.out.println(myCar.make);
//        System.out.println(myCar.model);
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);

        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

        myCar1.brake();
        myCar2.drive();

    }
}
