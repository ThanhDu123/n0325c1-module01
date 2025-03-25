package ss1_oop_overview;

import java.util.Scanner;

public class Student {
    String name;
    double mathScore;
    double literatureScore;

    void input(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Nhap ten: ");
         name = sc.nextLine();
        System.out.print("Nhap diem mon toan:");
        mathScore =  sc.nextDouble();
        System.out.print("Nhap diem mon van: ");
        literatureScore = sc.nextDouble();
    }
    double diemTB(){
        return (mathScore + literatureScore) / 2 ;
    }
    void outPut(){
        System.out.println("Thong tin hoc sinh");
        System.out.println("ten: " + name );
        System.out.println("diem mon toan: " + mathScore);
        System.out.println("diem mon van: " + literatureScore);
        System.out.println("Diem trung binh: " + diemTB());
    }
}
