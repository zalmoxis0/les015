package com.company;

import java.util.Scanner;

public class RealWorld {
    public static void main(String[] args) {
        // print : Welcome to the Calculator
        System.out.println("Welcome to the Calculator");

        // print: Please enter the equation
        System.out.println("Please enter the equation");


        // input(equation): ex ->10 * 5 = ?
        //          ex -> 999 - 25 = ?


        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        System.out.println(number1);
        System.out.println("Choose the operation");

        String operation = scanner.next();
        System.out.println( operation);
        System.out.println("Enter the second number");

        double number2 = scanner.nextDouble();
        System.out.println();
        double equation = number1 * number2;
        System.out.println("The equation is + " + equation);
        double division = number1 / number2;
        System.out.println("The division is + " + division);
        double substraction = number1 - number2;
        System.out.println("The substraction is + " + substraction);
        double plus = number1 + number2;
        System.out.println("The plus is + " + plus);

        // If else
        //if (equation){
       //     System.out.println("equation");;
       // }



/*
        String value1 = scanner.next();
        String value2 = scanner.next();
        int value3 = scanner.nextInt();
        String value4 = scanner.next();
        String value5 = scanner.next();
*/

/*
        System.out.println("Value 1 " + value1);
        System.out.println("Value 2 " + value2);
        System.out.println("Value 3 " + value3);
        System.out.println("Value 4 " + value4);
        System.out.println("Value 5 " + value5);
*/




/*
        char multiply = 'x';
        char minus = '-';
        char division = '/';
        char plus = '+';
*/
        // if (condition)
            // calculate
            // print

        // else
            // print: "You cannot enter a number greater than 999.."



        // else



    }
}
