/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author DELL
 */
// Kế thừa lớp person, dùng extends
public class Coder extends Person {

    private String Programming_Language; // thuộc tính riêng của lớp coder, lớp coder này sẽ kế thừa tất cả các thuộc tính của lớp Person + thuộc tính Programming_Language gọi riêng của lớp

    public Coder(String Programming_Language, String name, int age, String phone) {
        super(name, age, phone);
        this.Programming_Language = Programming_Language;
    }

// Ctrl Enter + Enter là ra Đây là constructor
    public Coder() {
    }

    //Constrctor có đối
//    public Coder(String Programming_Language, String name, int age, String phone) {
//        super(name, age, phone); // từ khóa super: lm vc vó những thuộc tính từ lớp cha
//        this.Programming_Language = Programming_Language; // từ khóa this để phân biệt biến thành viên programming laguage và tên 
//    }
    public String getProgramming_Language() {

        return Programming_Language;

    }

    public void setProgramming_Language(String Programming_Language) {

        this.Programming_Language = Programming_Language;
    }

    @Override
    public String toString() {
        return "Programming_Language: " + Programming_Language + ", " + super.toString();
    }

}
