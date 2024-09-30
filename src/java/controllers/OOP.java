/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.Coder;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class OOP {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Coder coder = new Coder();

        nhap(coder);
        getInfo(coder);
        System.out.println(coder.toString());
        System.out.println("Nhap thong tin 2: ");

        Coder coder2 = new Coder();
        nhap(coder2);
        getInfo(coder2);
        System.out.println(coder2.toString());
        System.out.println("Nhap thong tin 3: ");

        Coder coder3 = new Coder();
        nhap(coder3);
        getInfo(coder3);
        System.out.println(coder3.toString());
    }

    public static void nhap(Coder coder) {

        System.out.print("Nhap ten: ");
        String name = sc.next();
        coder.setName(name);

        System.out.print("Nhap tuoi: ");
        int age = sc.nextInt();
        coder.setAge(age);

        while (coder.getAge() == 0) {
            int tuoi = sc.nextInt();
            coder.setAge(tuoi); // tái sử dụng lại hàm setAge
        }

        System.out.print("Nhap SDT: ");
        String Phone = sc.next();
        coder.setPhone(Phone);

    }

    public static void getInfo(Coder coder) {
        boolean check = true;
        while (check) {
            System.out.println("Chon ngon ngu ban muon: \n 1.Java \n 2.C \n 3.C# \n 4.Python ");
            String ngonNgu = ".";
            check = false;
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    ngonNgu = "Java";
                    break;
                case 2:
                    ngonNgu = "C";
                    break;
                case 3:
                    ngonNgu = "C#";
                    break;
                case 4:
                    ngonNgu = "Python";
                    break;

                default:
                    System.out.println("Khong kha dung. Moi ban nhap lai");
                    check = true;

            }
            if (option >= 1 && option <= 4) {
                System.out.println("Ngon ngu ban muon la: " + ngonNgu);
            }

// Cách 2 - In từng ngôn ngữ 1 ở từng case
//        int option = sc.nextInt();
//        switch (option) {
//            case 1:
//                System.out.println("Ngon ngu ban lua chon la: Java");
//                coder.setProgramming_Language("Java");
//                break;
//            case 2:
//                System.out.println("Ngon ngu ban lua chon la: C");
//                coder.setProgramming_Language("C");
//                break;
//            case 3:
//                System.out.println("Ngon ngu ban lua chon la: C#");
//                coder.setProgramming_Language("C#");
//                break;
//            case 4:
//                System.out.println("Ngon ngu ban lua chon la: Python");
//                coder.setProgramming_Language("Python");
//                break;
//            default:
//                System.out.println("Khong kha dung. Moi ban nhap lai");
            coder.setProgramming_Language(ngonNgu);
        }
        System.out.println(".................................................");
//        System.out.println("Ngon ngu: " + coder.getProgramming_Language());  // gọi hàm get thông qua từ khóa coder
//        System.out.println("Ten: " + coder.getName());
//        System.out.println("Tuoi: " + coder.getAge());
//        System.out.println("SDT: " + coder.getPhone());

    }
}
