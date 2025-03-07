package ss5_java_loop;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "\t");
            }
        }
    }
}
