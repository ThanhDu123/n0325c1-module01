package ss3_java_overview;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tuoi cua ban : ");
        //scanner.nextline(); xoa toan bo du lieu trong bo nho
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("nhap vao ten cua ban : ");
        String  name = scanner.nextLine();

        System.out.println("so tuoi cua b la :" + age);
        System.out.println("ten cua ban la :"+name );
    }

}
