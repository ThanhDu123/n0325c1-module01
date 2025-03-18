package dtkt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise4 {
   static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap vao so luong phan tu cua mang:");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("xin nhap lai:");
            }
        } while (n < 0);
        int[] arr = new int[n];
        inputArr(arr);
        outputArr(arr);
        System.out.println();

    }
    static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("nhap vao phan tu arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }
    }

    static void outputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
    public static boolean isPrime(int[] arr) {
        for (int i = 0; i <= Math.sqrt(arr[i]); i++) { 
            if (arr[i] % i == 0) {
                return false;
            }
        }
        return true;
    }

}
