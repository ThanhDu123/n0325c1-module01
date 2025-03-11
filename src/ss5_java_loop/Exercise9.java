package ss5_java_loop;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        double s = 0.0;

        for (int i = 1 ; i <= n; i++) {

            int fact = 1;

            for (int j = 1; j <= (2 * i - 1); j++) {
                fact *= j;
            }
            s += 1.0 / fact;
        }
        System.out.println("Tổng S = " + s);
    }
}
