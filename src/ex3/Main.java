package ex3;

public class Main {
    public static void main(String[] args) {
        Coordinates coordinates1 = new Coordinates();
        Coordinates coordinates2 = new Coordinates();

        System.out.println("Enter coordinates 1: ");
        coordinates1.input();

        System.out.println("Enter coordinates 2: ");
        coordinates2.input();

        double distance = coordinates1.distanceTo(coordinates2);

        System.out.println("The distance between two points is" + distance);
    }
}
