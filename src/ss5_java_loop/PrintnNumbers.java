package ss5_java_loop;

import java.util.Scanner;

public class PrintnNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n : ");
        int n = sc.nextInt();
        int i;
        for (i = 1 ; i <= n; i++) {
            System.out.println(i + "\t");
        }
    }
}
