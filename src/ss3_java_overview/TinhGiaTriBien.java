package ss3_java_overview;

public class TinhGiaTriBien {
    static void Bai7A() {
        int i = 1, j = 1;
        int a = i++ + j++;
        System.out.println("7a: ");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);
    }

    static void Bai7B() {
        int i = 1, j = 1;
        int a = i++ + ++j;
        System.out.println("7b: ");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);
    }

    static void Bai7C() {
        int i = 1, j = 1;
        int a = ++i + j++;
        System.out.println("7c: ");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);
    }

    static void Bai7D() {
        int i = 1, j = 1;
        int a = i++ + j++ + i++ + j++;
        System.out.println("7d: ");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);
    }

    static void Bai7G() {
        int i = 1;
        int a = i++ + ++i - i-- - --i;
        System.out.println("7g: ");
        System.out.println("i = " + i);
        System.out.println("a = " + a);
    }

    static void Bai7H() {
        int a = 10;
        a += a++ + a++;
        System.out.println("7h: ");
        System.out.println("a = " + a);
    }


    public static void main(String[] args) {
        Bai7A();
        Bai7B();
        Bai7C();
        Bai7D();
        Bai7G();
        Bai7H();
    }
}
