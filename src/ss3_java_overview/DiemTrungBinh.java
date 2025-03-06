package ss3_java_overview;

import java.util.Scanner;

public class DiemTrungBinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap diem toan: ");
        double diemToan = scanner.nextDouble();
        System.out.print("Nhap he so toan: ");
        double heSoToan = scanner.nextDouble();

        System.out.print("Nhap diem ly: ");
        double diemLy = scanner.nextDouble();
        System.out.print("Nhap he so ly: ");
        double heSoLy = scanner.nextDouble();

        System.out.print("Nhap diem hoa: ");
        double diemHoa = scanner.nextDouble();
        System.out.print("Nhap he so hoa: ");
        double heSoHoa = scanner.nextDouble();

        double diemTB = (diemToan * heSoToan + diemLy * heSoLy + diemHoa * heSoHoa) / (heSoToan + heSoLy + heSoHoa);
        System.out.print("Diem trung binh: " + diemTB);

    }
}
