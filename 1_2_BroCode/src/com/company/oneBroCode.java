package com.company;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class oneBroCode {
    public static void main(String[] args) {
//        String name = JOptionPane.showInputDialog("input your name");
//        JOptionPane.showInputDialog(null , "Hello  "+ name );

//        int x = 123;
//        double y = 3.14;
//        boolean z = true;
//        char symbol = '@';
//        String name = "Bro";
//           System.out.println("Hello "+name);

//        String x = "water";
//        String y = "Kool-Aid";
//        String temp;
//        temp = x;
//        x=y;
//        y=temp;
//        System.out.println("x: "+x);
//        System.out.println("y: "+y);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is your name? ");
//        String name = scanner.nextLine();
//
//        System.out.println("How old are you? ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("What is your favorite food?");
//        String food = scanner.nextLine();
//
//        System.out.println("Hello "+name);
//        System.out.println("You are "+age+" years old");
//        System.out.println("You like "+food);

//         expression =     operands & operators
//         operands =  values, variables, numbers, quantity
//         operators = + - * / %

//        String name = JOptionPane.showInputDialog("Enter your name");
//        JOptionPane.showMessageDialog(null, "Hello "+name);
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        JOptionPane.showMessageDialog(null, "You are "+age+" years old");
//
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");


//        int x = 5;
//        int y = 3;
//        Math.max(x,y);
//        Math.min(x,y);
//        Math.abs(y);
//        Math.sqrt(x);
//        Math.round(x);
//        Math.ceil(x);
//        System.out.println(Math.floor(x));


//        double x;
//        double y;
//        double z;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter side x: ");
//        x = scanner.nextDouble();
//        System.out.println("Enter side y: ");
//        y = scanner.nextDouble();
//
//        z = Math.sqrt((x*x)+(y*y));
//
//        System.out.println("The hypotenuse is : "+z);
//
//        scanner.close();

//        Random random = new Random();
//        int x = random.nextInt(6)+1;
//        //double y = random.nextDouble();
//        //boolean z = random.nextBoolean();
//        System.out.println(x);


        //# if statement = performs a block of code if it's condition evaluates to be true
//        int age = 75;
//        if(age==75) {
//            System.out.println("Ok Boomer!");
//        }
//        else if(age>=18) {
//            System.out.println("You are an adult!");
//        }
//        else if(age>=13) {
//            System.out.println("You are a teenager!");
//        }
//        else {
//            System.out.println("You are not an adult!"); }


//        // #switch = statement that allows a variable to be tested for equality against a list of values
//        String day = "Friday";
//        switch(day) {
//            case "Sunday": System.out.println("It is Sunday!");
//                break;
//            case "Monday": System.out.println("It is Monday!");
//                break;
//            case "Tuesday": System.out.println("It is Tuesday!");
//                break;
//            case "Wednesday": System.out.println("It is Wednesday!");
//                break;
//            case "Thursday": System.out.println("It is Thursday!");
//                break;
//            case "Friday": System.out.println("It is Friday!");
//                break;
//            case "Saturday": System.out.println("It is Saturday!");
//                break;
//            default: System.out.println("That is not a day!");
//        }


        // #logical operators = used to connect two or more expressions
        //
        //						&& = (AND) both conditions must be true
        // 						|| = (OR) either condition must be true
        //						! = (NOT) reverses boolean value of condition

// -------------------------------- Example 1 --------------------------------
/*
		int temp = 15;

		if(temp>30) {
			System.out.println("It is hot outside");
		}
		else if(temp>=20 && temp<=30) {
			System.out.println("It is warm outside");
		}
		else {
			System.out.println("It is cold outside");
		}

*/
// -------------------------------- Example 2 --------------------------------
/*
		Scanner scanner = new Scanner(System.in);

		System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next();

		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("YOu are still playing the game pew pew");
		}
		else {
			System.out.println("You quit the game");
		}
*/
    }
}
