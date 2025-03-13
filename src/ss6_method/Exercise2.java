package ss6_method;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        //a
        System.out.println("So dao cua " + n + " la: " + reversedNumber(n));

        //b
        if (isSymmetricalNumber(n)) {
            System.out.println(n + " la so doi xung");
        } else {
            System.out.println(n + " khong la so doi xung");
        }

        //c
        if (isSquareNumber(n)) {
            System.out.println(n + " la so chinh phuowng");
        } else {
            System.out.println(n + " khong la so chinh phuong");
        }
        //d
        if (isPrimeNumber(n)) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong la so nguyen to");
        }

        //e
        System.out.println("Tong cac chu so le la: " + calculateTotalOddDigits(n));

        //f
        System.out.println("Tong cac so nguyen to la: " + calculateTotalPrime(n));

        //g
        System.out.println("Tong cac so chinh phuong la: " + calculateTotalSquare(n));
    }
    public static int reversedNumber(int a) {
        int reversed = 0;
        while (a != 0) {
            reversed = (reversed * 10) + (a % 10);
            a /= 10;
        }
        return reversed;
    }

    //c
    public static boolean isSquareNumber(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

    //b
    public static boolean isSymmetricalNumber(int n) {
        return n == reversedNumber(n);
    }

    //d
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //e
    public static int calculateTotalOddDigits(int n) {
        int total = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                total += digit;
            }
            n = n / 10;
        }
        return total;
    }

    //f
    public static int calculateTotalPrime(int n) {
        int total = 0;
        while (n != 0) {
            if (isPrimeNumber(n % 10)) {
                total += n % 10;
            }
            n /= 10;
        }
        return total;
    }

    //g
    public static int calculateTotalSquare(int n) {
        int total = 0;
        while (n != 0) {
            if (isSquareNumber(n % 10)) {
                total += n % 10;
            }
            n /= 10;
        }
        return total;
    }
}
