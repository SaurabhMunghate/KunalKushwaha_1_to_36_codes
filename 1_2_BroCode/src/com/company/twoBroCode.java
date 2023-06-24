package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class twoBroCode {
    public static void main(String[] args) {


        // ### while loop = executes a block of code as long as a it's condition remains true
//        Scanner scanner = new Scanner(System.in);
//        String name = "";
//
//       ### while(name.isBlank()) {
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//        System.out.println("Welcome "+name);


//        // for loop = executes a block of code a limited amount of times
//        for(int i=10; i>=0; i--) {
//            System.out.println(i);
//        }
//        System.out.println("Happy new year!");


        //  nested loops = a loop inside of a loop
//        Scanner scanner = new Scanner(System.in);
//        int rows;
//        int columns;
//        String symbol = "";
//
//        System.out.println("Enter # of rows: ");
//        rows = scanner.nextInt();
//        System.out.println("Enter # of columns: ");
//        columns = scanner.nextInt();
//        System.out.println("Enter symbol to use: ");
//        symbol = scanner.next();
//
//        for (int i = 1; i <= rows; i++) {
//            System.out.println();
//            for (int j = 1; j <= columns; j++) {
//                System.out.print(symbol);
//            }
//        }

        // ### array = used to store multiple values within a single variable

//        String[] cars = new String[3];
//
//        cars[0] = "Camaro";
//        cars[1] = "Corvette";
//        cars[2] = "Tesla";
//
//        for(int i=0; i<cars.length; i++) {
//            System.out.println(cars[i]);
//        }

//        //### 2D array = an array of arrays
//
//        String[][] cars = 	{
//                {"Camaro","Corvette","Silverado"},
//                {"Mustang","Ranger","F-150"},
//                {"Ferrari","Lambo","Tesla"}
//        };
//
//		/*
//		cars[0][0] = "Camaro";
//		cars[0][1] = "Corvette";
//		cars[0][2] = "Silverado";
//		cars[1][0] = "Mustang";
//		cars[1][1] = "Ranger";
//		cars[1][2] = "F-150";
//		cars[2][0] = "Ferrari";
//		cars[2][1] = "Lambo";
//		cars[2][2] = "Tesla";
//		*/
//
//        for(int i=0; i<cars.length; i++) {
//            System.out.println();
//            for(int j=0; j<cars[i].length; j++) {
//                System.out.print(cars[i][j]+" ");
//            }


        // ### String = a reference data type that can store one or more characters
        //   reference = data types have access to useful methods

//        String name = "Bro";

        //boolean result = name.equalsIgnoreCase("bro");
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("o");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        //String result = name.replace('o', 'a');

        //System.out.println(result);

// ### wrapper class = 	provides a way to use primitive data types as reference data types
        //				reference data types contain useful methods
        //				can be used with collections (ex.ArrayList)

        //primitive		//wrapper
        //---------		//-------
        // boolean		Boolean
        // char			Character
        // int			Integer
        // double		Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

//        Boolean a = true;
//        Character b = '@';
//        Integer c = 123;
//        Double d = 3.14;

// ArrayList = 	a resizable array.
        //				Elements can be added and removed after compilation phase
        //				store reference data types

//        ArrayList<String> food = new ArrayList<String>();
//
//        food.add("pizza");
//        food.add("hamburger");
//        food.add("hotdog");
//
//        //food.set(0, "sushi");
//        //food.remove(2);
//        //food.clear();
//
//        for(int i=0; i<food.size(); i++) {
//            System.out.println(food.get(i));
//        }


//        ArrayList<ArrayList<String>> groceryList = new ArrayList();
//
//        ArrayList<String> bakeryList = new ArrayList();
//        bakeryList.add("pasta");
//        bakeryList.add("garlic bread");
//        bakeryList.add("donuts");
//
//        ArrayList<String> produceList = new ArrayList();
//        produceList.add("tomatoes");
//        produceList.add("zucchini");
//        produceList.add("peppers");
//
//        ArrayList<String> drinksList = new ArrayList();
//        drinksList.add("soda");
//        drinksList.add("coffee");
//
//        groceryList.add(bakeryList);
//        groceryList.add(produceList);
//        groceryList.add(drinksList);
//        System.out.println(groceryList);


//
//        // for-each = 	traversing technique to iterate through the elements in an array/collection
//        //				less steps, more readable
//        //				less flexible
//
//        //String[] animals = {"cat","dog","rat","bird"};
//        ArrayList<String> animals = new ArrayList<String>();
//
//        animals.add("cat");
//        animals.add("dog");
//        animals.add("rat");
//        animals.add("bird");
//
//        for(String i : animals) {
//            System.out.println(i);


//            // method = a block of code that is executed whenever it is called upon
//            int x = 3;
//            int y = 4;
//            int z = add(x,y);
//            System.out.println(z);
//        }
//        static int add(int x, int y) {
//            int z = x + y;
//            return z; }



// ###overloaded methods = methods that share the same name but have different parameters
//						method name + parameters = method signature
//
//        double x = add(1.0,2.0,3.0,4.0);
//
//        System.out.println(x);
//    }
//    static int add(int a, int b) {
//        System.out.println("This is overloaded method #1");
//        return a + b;
//    }
//    static int add(int a, int b, int c) {
//        System.out.println("This is overloaded method #2");
//        return a + b + c;
//    }
//    static int add(int a, int b, int c, int d) {
//        System.out.println("This is overloaded method #3");
//        return a + b + c + d;
//    }
//    static double add(double a, double b) {
//        System.out.println("This is overloaded method #4");
//        return a + b;
//    }
//    static double add(double a, double b, double c) {
//        System.out.println("This is overloaded method #5");
//        return a + b + c;
//    }
//    static double add(double a, double b, double c, double d) {
//        System.out.println("This is overloaded method #6");
//        return a + b + c + d;



        // ###  printf() = 	an optional method to control, format, and display text to the console window
        //				two arguments = format string + (object/variable/value)

//        boolean myBoolean = true;
//        char myChar = '@';
//        String myString = "Bro";
//        int myInt = 50;
//        double myDouble = 1000;

        // [conversion-character]
        //System.out.printf("%b",myBoolean);
        //System.out.printf("%c",myChar);
        //System.out.printf("%s",myString); //				% [flags] [precision] [width] [conversion-character]
        //System.out.printf("%d",myInt);
        //System.out.printf("%f",myDouble);

        //[width]
        // minimum number of characters to be written as output
        //System.out.printf("Hello %10s",myString);

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        //System.out.printf("You have this much money %.1f",myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        //System.out.printf("You have this much money %,f",myDouble);

//        final double PI = 3.14159;
//
//        //PI = 4;  //You can't change a final variable
//
//        System.out.println(PI);

    }
}