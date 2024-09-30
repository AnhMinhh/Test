

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class BTVN3 {
    // static dùng để giúp gọi được hàm ở trong tất cả các chương trình 
// myNumber là 1 biến thành viên nó ko nằm trong 1 hàm nào, nma nó nằm trong class, thường nằm ở trên đầu

    static Scanner myNumber = new Scanner(System.in);

// Hàm in Menu để user chọn 
    public static void inMenu() {
        System.out.println("1. Tinh tong: ");
        System.out.println("2. Tinh hieu: ");
        System.out.println("3. Tinh tich: ");
        System.out.println("4. Tinh thuong: ");
        System.out.println("5. Thoat. ");
    }

// 2 hàm nhập số a và b 
    public static int enterNumberA() {
        int a = myNumber.nextInt();
        return a;
    }

    public static int enterNumberB() {
        int b = myNumber.nextInt();
        return b;
    }

// Hàm để tính thương trong các TH oái oăm   
    public static void tinhThuong(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("So khong kha thi. Moi ban chon lai.");
        } else {
            System.out.println("Ban muon thuc hien phep chia nhu nao?\n 1. a/b \n 2. b/a");
            int option1 = myNumber.nextInt();
            switch (option1) {
                case 1:
                    System.out.println((b != 0) ? "a/b = " + (a / b) : "Khong the thuc hien phep chia. Moi ban chon lai");
                    break;
                case 2:
                    System.out.println((a != 0) ? "b/a = " + (b / a) : "Khong the thuc hien phep chia. Moi ban chon lai");
                    break;

            }
        }

    }

// truyền tham số - parameter vao cho phương thức (int a, int b)
// Hàm xử lí số liệu tính tổng, hiệu , tích ,nhân
    public static void xuLiSoLieu(int a, int b) {
        while (true) {
            System.out.println("Moi ban nhap lua chon ");
            int option = myNumber.nextInt();
            switch (option) {
                case 1:
                    System.out.println("a+b = " + (a + b));
                    break;
                case 2:
                    System.out.println("a-b = " + (a - b));
                    break;
                case 3:
                    System.out.println("a*b = " + (a * b));
                    break;
                case 4:
                    tinhThuong(a, b);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Khong kha dung. Moi ban chon lai");
            }

        }
    }
// Hàm Main, gọi các hàm đã viết ở trên xuống hàm main đẻ chạy ctirnh (mỗi 1 project chỉ có 1 hàm main duy nhất)    

    public static void main(String[] args) {

        System.out.println("Nhap so a: ");
        int a = enterNumberA();
        System.out.println("Nhap so b: ");
        int b = enterNumberB();
        inMenu();
        xuLiSoLieu(a, b);

    }

}
