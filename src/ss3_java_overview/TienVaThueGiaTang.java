package ss3_java_overview;

import java.util.Scanner;

public class TienVaThueGiaTang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        String tenSP = scanner.nextLine();
        System.out.print("Nhap so luong: ");
        int soLuong = scanner.nextInt();
        System.out.print("Nhap don gia: ");
        double donGia = scanner.nextDouble();

        double Tien = soLuong * donGia;
        double VAT = Tien * 0.1;

        System.out.println("Ten san pham : " + tenSP);
        System.out.println("Tong tien : " + Tien);
        System.out.println("Thue VAT : " + VAT);
    }
}
