package ss6_method;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = sc.nextInt();
        System.out.print("Nhap ky tu: ");
        char ktu = sc.next().charAt(0);
        if (isPrimeNumber(n)) {
            System.out.println("n la so nguyen to");
        } else {
            System.out.println("n khong phai so nguyen to");
        }

        System.out.println("tong cua cac so nguyen to la : " + totalPrime(12345));
        System.out.println("Ky tu " + ktu + "sang thuong la :" + toLowerCase(ktu));
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();
        System.out.print("Nhap d: ");
        double d = sc.nextDouble();
        System.out.println("nghiem cua phuong trinh bac 1 la : " + levelOne(a,b));
       levelTwo(a,b,c);
        System.out.println("gia tri nho nhat cua 4 so nguyen la :" + min(a,b,c,d));
    }

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

    public static int totalPrime(int n) {
        int total = 0;
        while (n != 0) {
            int digit = n % 10;
            if (isPrimeNumber(digit)) {
                total += digit;
            }
            n /= 10;
        }
        return total;
    }

    public static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'z') {
            c += 32;
        }
        return c;
    }
    public static double levelOne(double a, double b){
        double nghiem;
        if(a == 0){
            if (b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }else {
                System.out.println("Phuong tring vo nghiem");
            }
        }
        nghiem  = -b/a;
        return nghiem;
    }
    public static void  levelTwo (double a, double b, double c){
        if (a == 0) {
            levelOne(b,c);
        } else {
            double delta = b * b - (4 * a * c);
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm!!");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có 1 nghiệm duy nhất là : " + x);
            } else  {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiệm thứ nhất là : " + x1);
                System.out.println("Nghiệm thứ hai là : " + x2);
            }
        }
    }
    public static double min(double a, double b,double c, double d){
        double min = Math.min(a,b);
        min = Math.min(min, c);
        min = Math.min(min, d);
        return min;
    }
}

