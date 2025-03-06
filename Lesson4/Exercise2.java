package com.cmcglobal.Lesson4;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage: ");
        int percent = sc.nextInt();
        if (percent > 100 || percent <0){
            System.out.println("Invalid percentage");
        }
        if (percent <= 100 && percent > 0) {
            switch (percent / 10) {
                case 9, 10:
                    System.out.println("Your grade is A");
                    break;
                case 8:
                    System.out.println("Your grade is B");
                    break;
                case 7:
                    System.out.println("Your grade is C");
                    break;
                case 6:
                    System.out.println("Your grade is D");
                    break;
                default:
                    System.out.println("Your grade is F");
                    break;
            }
        }
    }
}
