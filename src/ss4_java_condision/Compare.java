package ss4_java_condision;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("sô lớn nhất là: " + a);
            System.out.println("sô nhỏ nhất là: " + b);

        } else {
            System.out.println("sô lớn nhất là: " + b);
            System.out.println("sô nhỏ nhất là: " + a);
        }
    }
}
