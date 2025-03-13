package ss6_method;

public class Main2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        calTotal(a, b);
        System.out.println("total: " + calTotal2(a, b));
        int total = calTotal2(a,b);
        System.out.println("total: " +calTotal2(total, c));
    }

    public static void calTotal(int a, int b) {
        int total = a + b;
        System.out.println("Total: " +total );
    }

    public static int calTotal2(int a, int b) {
        return a + b;
    }
}

