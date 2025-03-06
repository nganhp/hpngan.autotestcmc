package com.cmcglobal.Lesson4;

public class Exercise1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int result = 0;
            if (i % 3 == 0) {
                result += 3;
            }
            if (i % 5 == 0) {
                result += 5;
            }
            switch (result) {
                case 3:
                    System.out.println("Fizz");
                    break;
                case 5:
                    System.out.println("Buzz");
                    break;
                case 8:
                    System.out.println("FizzBuzz");
                    break;
                default:
                    System.out.println(i);
                    break;
            }

        }
        System.out.println();

    }
}