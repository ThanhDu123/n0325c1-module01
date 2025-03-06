package ss3_java_overview;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = scanner.nextInt();
        System.out.print("nhap b: ");
        int b = scanner.nextInt();
        System.out.println("tong la: " + (a + b));
        System.out.println("hieu la: " + (a - b));
        System.out.println("tich la: " + (a * b));
        System.out.println("thuong la: " + (double) a / b);
    }
}
