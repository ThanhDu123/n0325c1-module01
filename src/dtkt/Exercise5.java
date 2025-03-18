package dtkt;

import java.util.Scanner;

public class Exercise5 {
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
        solonNhi(arr);

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
    public static int solonNhi(int[] arr){
        if(arr.length < 2 ){
            System.out.println("khong tim thay so lon nhi: ");
        }
        int max = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++){
            if ( i >
                    max) {
                secondMax = max;
                max =  i ;
            }else if (i > secondMax && i < max){
                secondMax = i;
            }
        }
            return secondMax;
    }
}
