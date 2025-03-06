package com.cmcglobal.Lesson3;

import java.util.PrimitiveIterator;
import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vui lòng nhập tên người dùng: ");
//        String name = scanner.nextLine();
//        System.out.println("Vui lòng nhập năm sinh: ");
//        int yearBorn = scanner.nextInt();
//        System.out.println("Tên người dùng là: " + name + "\n" + "Tuổi: " + (2025 - yearBorn));

//        Scanner hocphi = new Scanner(System.in);
//        System.out.println("Nhập tên học sinh: ");
//        String name = hocphi.nextLine();
//        System.out.println("Nhập số buổi học: ");
//        int lesson = hocphi.nextInt();
//        System.out.println("Tổng học phí của " + name +  " là " + (50000 * lesson));

//        Scanner myObj = new Scanner(System.in);
//
//        System.out.println("Enter name, age and salary:");
//
//        // String input
//        String name = myObj.nextLine();
//
//        // Numerical input
//        int age = myObj.nextInt();
//        double salary = myObj.nextDouble();
//
//        // Output input by user
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Salary: " + salary);

        Scanner dientichchunhat = new Scanner(System.in);
        System.out.println("Nhập chiều dài hình chữ nhật: ");
        int chieudai = dientichchunhat.nextInt();
        System.out.println("Nhập chiều rộng hình chữ nhật: ");
        int chieurong = dientichchunhat.nextInt();
        System.out.println("Diện tích hình chữ nhật: " + (chieudai*chieurong));
    }
}
