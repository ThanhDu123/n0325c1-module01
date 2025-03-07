package ss4_java_condision;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println(" phương trình vô số nghiệm ");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = -c / b;
                System.out.println("nghiệm của phương trình là: " + x);
            }
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
                System.out.println("Phương trình có 2 nghiệm: ");
                System.out.println("Nghiệm thứ nhất là : " + x1);
                System.out.println("Nghiệm thứ hai là : " + x2);
            }

        }
    }
}


