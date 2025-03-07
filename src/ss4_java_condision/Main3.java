package ss4_java_condision;


public class Main3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        int min2 = Math.min(a, b);
        System.out.println(max);
        System.out.println(min);
        System.out.println(min2);
    }
}
