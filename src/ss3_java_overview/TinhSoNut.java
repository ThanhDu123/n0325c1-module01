package ss3_java_overview;

import java.util.Scanner;

public class TinhSoNut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap bien so xe: ");
        int n = scanner.nextInt();

        int sum = n % 10;
        n = n / 10;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n;

        int soNut = sum % 10;

        System.out.print("So nut: " + soNut);
    }
}
