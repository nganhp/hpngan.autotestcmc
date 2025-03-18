package com.cmcglobal.Lesson5;
import com.cmcglobal.Lesson5.RobotHutBui;

public class Main {
    public static void main (String[] args){

        RobotHutBui robot_1 = new RobotHutBui("XB_1", 10);
        System.out.println("Hoàn tất tạo ra một robot hút bụi đặt tên robot_1");
        RobotHutBui robot_2 = new RobotHutBui("XB_1", 30);
        System.out.println("Hoàn tất tạo ra một robot hút bụi đặt tên robot_2");
        System.out.println("--------------------------------");
        int binhNuoc = 0;
        System.out.println("Lượng nước trong robot_1 là: " + robot_1.getLuongNuoc());
        robot_1.layNuoc();
        System.out.println("Lương nước trong robot_1 sau khi lấy nước là: " + robot_1.getLuongNuoc());
        binhNuoc += robot_1.chamNuoc();
        System.out.println("Lượng nước sau khi châm nước vào bình: " + robot_1.chamNuoc());
        System.out.println("Lượng nước trong bình sau khi được châm nước: " + binhNuoc);
        System.out.println("--------------------------------");
        System.out.println("Lượng nước trong robot_1 là: " + robot_2.getLuongNuoc());
        robot_2.layNuoc();
        System.out.println("Lương nước trong robot_1 sau khi lấy nước là: " + robot_2.getLuongNuoc());
        binhNuoc += robot_2.chamNuoc();
        System.out.println("Lượng nước sau khi châm nước vào bình: " + robot_2.chamNuoc());
        System.out.println("Lượng nước trong bình sau khi được châm nước là: " + binhNuoc);



    }
}
