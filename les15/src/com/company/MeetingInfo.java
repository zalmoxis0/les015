package com.company;

import java.util.Scanner;

public class MeetingInfo {
    public static void main(String[] args) {
        // print
        System.out.println("Welcome to Meeting Generator");

        // print: please select a number
        System.out.println("Please select a number ");

        // input(int number)
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // if
        boolean condition666 = number == 666;
        boolean conditionMinus666 = number == -666;
        boolean condition999 = number == 999;

        if (condition666){
            System.out.println("This is evil ");
        }

        else if(conditionMinus666){
            System.out.println("This is doable");
        }

        else if(condition999){
            System.out.println("That is very costly process");
        }

        // else if

        else {
            System.out.println("None of these numbers "  + '\n' + " 666 " + " -666 " +
                    " 999 " + '\n' + " are chosen");
        }


    }
}
