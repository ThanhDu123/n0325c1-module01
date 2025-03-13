package ss6_method;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        nhapThongtin();
        xuatThongtin();

    }
    static String hoTen;
    static int tuoi;
    static String gioiTinh;
    static double mucLuong;
    static double diemTrungbinh;

    public static void nhapThongtin(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap Ho Ten Nhan Vien: ");
       hoTen = sc.nextLine();

        System.out.print("Nhap Tuoi nhan vien: ");
        tuoi = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap Gioi Tinh nhan vien: ");
        gioiTinh = sc.nextLine();

        System.out.print("Nhap muc Luong nhan vien: ");
        mucLuong = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap diem trung binh nhan vien: ");
        diemTrungbinh = Double.parseDouble(sc.nextLine());
    }
    public static void xuatThongtin(){
        System.out.println("Ten: "+ hoTen);
        System.out.println("Tuoi: "+ tuoi);
        System.out.println("Gioi Tinh: "+ gioiTinh);
        System.out.println("Muc Luong "+ mucLuong);
        System.out.println("Diem Trung Binh; " + diemTrungbinh);
    }

}
