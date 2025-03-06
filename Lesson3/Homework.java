package com.cmcglobal.Lesson3;

import java.awt.print.Printable;
import java.util.Scanner;

public class Homework {
    public static void Exercise1() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int firstnumber = number.nextInt();
        System.out.println("Enter the second integer: ");
        int secondnumber = number.nextInt();

        int additional = firstnumber + secondnumber;
        int subtraction = firstnumber - secondnumber;
        int multipliction = firstnumber * secondnumber;
        double division = (double) firstnumber / secondnumber;

        System.out.println("Additional: " + additional);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multipliction);
        System.out.println("Division: " + division);
    }

    public static void Exercise2() {
        Scanner temperature = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double C = temperature.nextDouble();

        double F = ((C * 9 / 5) + 32);

        System.out.println("Temperature in Fahrenheit: " + F);
    }

    public static void Exercise3() {
        Scanner BMIcal = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms: ");
        double weight = BMIcal.nextDouble();
        System.out.println("Enter your height in meters: ");
        double height = BMIcal.nextDouble();

        double BMI = weight / (height * height);

        System.out.println("Your BMI is: " + BMI);
    }

    public static void Exercise4() {
        Scanner integer = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int intnumber = integer.nextInt();

        int incrementing = intnumber++;
        int decrementing = intnumber--;

        System.out.println("After incrementing: " + incrementing);
        System.out.println("After decrementing: " + decrementing);
    }

    public static void Exercise5() {
        Scanner leapyear = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = leapyear.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year.");

        }
    }
        public static void main (String[] args){
//        Exercise1();
//        Exercise2();
//        Exercise3();
//        Exercise4();
            Exercise5();

        }
    }


