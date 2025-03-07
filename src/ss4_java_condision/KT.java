package ss4_java_condision;

import java.util.Scanner;

public class KT {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên x : ");
        int x = scanner.nextInt();

        double squareRoot = Math.sqrt(x);
        if (squareRoot % 1==0){
            System.out.println("x là số chính phương");
        }else {
            System.out.println("x không phải là số chính phương");
        }
    }
}
