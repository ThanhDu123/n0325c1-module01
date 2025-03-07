package ss4_java_condision;

import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        double experience ;
        if(a == 0 ){
            if (b == 0 ){
                System.out.println(" phương trình vô số nghiệm ");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }else {
            experience = -b / a;
            System.out.println("nghiệm của phương trình là: " + experience);
        }

    }
}




