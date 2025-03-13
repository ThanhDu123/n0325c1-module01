package ss6_method;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = sc.nextInt();
        System.out.printf("%d phan tu n cua Fibonacy: ", n);
        dayFibonacy(n);

    }
    public static void dayFibonacy(int n){
        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        for (int i=1 ; i <= n ; i++){
            System.out.println(fn + "\t");
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
    }
}
