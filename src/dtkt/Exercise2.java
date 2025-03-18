package dtkt;

import java.util.Scanner;

public class Exercise2 {
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
        System.out.println("hiệu của Tổng các số chẵn và Tổng các số lẻ có trong mảng la: "+ (tongSochan(arr) - tongSole(arr)));
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
    public  static int tongSole(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>0 && arr[i] % 2 != 0){
                sum += arr[i];
            }
        }
        return sum;
    }
    public static int tongSochan(int[] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>0 && arr[i] % 2 == 0){
                total += arr[i];
            }
        }
        return total;
    }

}
