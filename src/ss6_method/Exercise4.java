package ss6_method;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NHap a: ");
        int a = sc.nextInt();
        System.out.print("NHap b: ");
        int b = sc.nextInt();
        System.out.println("USCLN cua a va b la:" + uscln(a,b));
    }

    static int uscln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        if( max % min == 0){
            return min;
        }
        for (int i = min/2 ; i >= 1 ; i--){
            if(a % i ==0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }
}
