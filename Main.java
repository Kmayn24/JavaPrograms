// First Java Program made by Kyle Maynard - by Kyle Maynard
// Made in the morning from 0600 - 0700 0n October 4, 2017

package com.kylemaynard;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       //double firstInteger;
        //double secondInteger;
        //char symbol;

        double result;

        System.out.println("Welcome to my Simple Math Program!");
        System.out.println("What is your first number?");
        Scanner in = new Scanner(System.in);
        double firstInteger = in.nextDouble();
        in.nextLine();

        System.out.println("What is your second number?");
        Scanner scanner = new Scanner(System.in);
                double secondInteger = in.nextDouble();
                scanner.nextLine();
        System.out.print("Your first number is " + firstInteger + " Your second number is " + secondInteger);

        System.out.println("What kind of math would you like to perform? (+,-,*,/)");
        Scanner scan = new Scanner(System.in);
        String symbol = scan.nextLine();
        System.out.println("You have chosen to " + symbol + " the two numbers.");


        //could not get the switch case to work for strings --- possibly try ex: case ("*")
        /*
        switch (symbol) {
            case
               result = firstInteger * secondInteger;
               break;
            case symbol = "/";
                result = firstInteger / secondInteger;
                break;
            case symbol = "+";
                result = firstInteger + secondInteger;
                break;
            case symbol = "-";
                result = firstInteger - secondInteger;
                break;

            default: symbol = "Invalid Symbol";
            break;
        }
        */


        if (symbol.equals ("+"))
        { result = firstInteger + secondInteger;
            System.out.println(result);
    }
    else if (symbol.equals ("-"))
        { result = firstInteger - secondInteger;
            System.out.println(result);

        }
    else if (symbol.equals ("*"))
        {
            result = firstInteger * secondInteger;
            System.out.println(result);
        }
        else if (symbol.equals("/"))
        { result = firstInteger / secondInteger;
            System.out.println(result);
    }
        else {
            result = 0;
        }

    System.out.println("Your result is: " + result);
        }}
