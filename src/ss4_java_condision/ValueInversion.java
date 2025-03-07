package ss4_java_condision;

import java.util.Scanner;

public class ValueInversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a : ");
        int a = sc.nextInt();
        System.out.print("Nhap b : ");
        int b = sc.nextInt();
        int temp = a ;
        a = b ;
        b = temp;
        System.out.println("Gia tri khi dao la : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
