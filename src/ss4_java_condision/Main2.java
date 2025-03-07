package ss4_java_condision;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap day : ");
        int Day = sc.nextInt();
        switch (Day) {
            case 1:
                System.out.println("chu nhat");
                break;
            case 2:
                System.out.println("thu 2 ");
                break;
            case 3:
                System.out.println("thu 3");
                break;
            default:
                System.out.println("nhap sai gia tri");
        }
    }
}
