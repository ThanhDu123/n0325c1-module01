package ss5_java_loop;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        double s = 0.0;

        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
        }
        System.out.println("Tổng S = " + s);
    }
}
