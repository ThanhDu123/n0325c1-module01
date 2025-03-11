package ss5_java_loop;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        int a = 1;
        int d = 1; // đặt biến dấu

        while (a <= n) {
            System.out.print(a * d + "\t");
            a = 2 * a + 1;
            d = -d;
        }
    }
}
