package ss4_java_condision;

import java.util.Scanner;

public class TNCT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap TNCT :");
        int TNCT = sc.nextInt();
        double LCB = 650000.0;
        double hs = 0;
        if (TNCT < 12) {
            hs = 1.92;
        } else if (TNCT < 36) {
            hs = 2.34;
        } else if (TNCT < 60) {
            hs = 3;
        }else if(TNCT >= 60) {
            hs =4.5;
        }
         double Money = hs * LCB;
        System.out.println("Lường của bạn là: " + Money);
    }
}
