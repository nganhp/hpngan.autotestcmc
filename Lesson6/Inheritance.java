package com.cmcglobal.Lesson6;

import java.io.PrintStream;

//
//interface Walkable {
//    void walk();
//}
//interface Flyable {
//    void fly();
//}
//
//class Bird implements Walkable, Flyable {
//    @Override
//    public void fly() {
//        System.out.println("Bird can flt");
//    }
//
//    @Override
//    public void walk() {
//        System.out.println("Bird can walk");
//    }
//
//    public void makeSound () {
//        System.out.println("Make sound : quac quac");
//    }
//}

public class Inheritance {
    public static void main(String[] args) {
        tinhToan tong = new tinhToan();
        int ketQua = tong.tinhTong(2,5);
        System.out.println("Tổng 2 số:" + ketQua);
    }
}
class tinhToan {
    public int a;
    public int b;

    public int tinhTong (int a, int b) {
        return a + b;

    }



//        int tong = tínhTong.tinhTong(2,3);
//        System.out.println("Tổng 2 số là: " + tong);



}

