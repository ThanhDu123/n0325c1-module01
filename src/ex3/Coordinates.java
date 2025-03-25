package ex3;

import java.util.Scanner;

public class Coordinates {
    double x;
    double y;

    void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        x = scanner.nextDouble();

        System.out.print("Enter y: ");
        y = scanner.nextDouble();
    }

    double distanceTo(Coordinates other) {

        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
    }
}
