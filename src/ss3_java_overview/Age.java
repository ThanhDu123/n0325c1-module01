package ss3_java_overview;

import java.time.Year;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap nam sinh :");
        int year = scanner.nextInt();
        int age = Year.now().getValue() - year;
        System.out.println("so tuoi cua b la:" + age);
    }
}
// how to....in java ( thac mac hoi gg)
