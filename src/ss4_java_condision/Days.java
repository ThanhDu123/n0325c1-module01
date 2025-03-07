package ss4_java_condision;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tháng: ");
        int Month = sc.nextInt();
        System.out.print("Nhập năm: ");
        int year = sc.nextInt();
        int DayInMonth;
        switch (Month) {
            case 4:
            case 6:
            case 9:
                DayInMonth = 30;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    DayInMonth = 29 ;
                }else {
                    DayInMonth = 28 ;
                }
                break;
            default:
                DayInMonth = 31 ;
                break;
        }
        System.out.printf("Số ngày trong tháng: %d Ngày tháng %d năm %d", DayInMonth, Month, year);
    }
}
