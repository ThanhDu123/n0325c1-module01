package ss6_method;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        //a
        System.out.println("Tong tu 1 den " + n + " la: " + cauA(n));

        //b
        System.out.println("Tong tu 1 den " + n + " la: " + cauB(n));

        //c
        System.out.println("Tong tu 1 den " + n + " la: " + cauC(n));

        //D
        System.out.println("Tich tu 1 den " + n + " la: " + cauD(n));
    }
    public static int cauA(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    //b
    public static int cauB(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i * i;
        }
        return total;
    }

    //C
    public static double cauC(int n) {
        double total = 0;
        for (int i = 1; i <= n; i++) {
            total += (double) 1 / i;
        }
        return total;
    }

    //d
    public static int cauD(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }
}
