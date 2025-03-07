package ss4_java_condision;

import java.util.Scanner;

public class English {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so : ");
        int so = sc.nextInt();
        if (so < 0 || so > 10) {
            System.out.println("so khong hop le ");
        } else if (so == 1) {
            System.out.println("one");
        } else if (so == 2) {
            System.out.println("two");
        } else if (so == 3) {
            System.out.println("three");
        } else if (so == 4) {
            System.out.println("four");
        } else if (so == 5) {
            System.out.println("five");
        } else if (so == 6) {
            System.out.println("six");
        } else if (so == 7) {
            System.out.println("seven");
        } else if (so == 8) {
            System.out.println("eight");
        } else if (so == 9) {
            System.out.println("nice");
        } else if (so == 10) {
            System.out.println("ten");
        }
    }
}
