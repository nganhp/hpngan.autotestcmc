package com.cmcglobal.Lesson4;

import java.util.Scanner;
import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(11);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!\n" +
                "I have selected a number between 1 and 10. Try to guess it!");
        int guessNumber;
        int attempts = 0;
do {
        System.out.println("Enter your guest: ");
        guessNumber = scanner.nextInt();
        attempts++;
        if (guessNumber < randomNumber) {
        System.out.println("Too low! Try again.\n");
        }
        else if (guessNumber > randomNumber) {
        System.out.println("Too high! Try again.\n");
        }
        else if (guessNumber == randomNumber){
        System.out.println("Correct! The number was " + guessNumber + "\n" + "It took you "+ attempts + " attempts.\n");
        }

        }
        while (guessNumber!= randomNumber);
    }

}

