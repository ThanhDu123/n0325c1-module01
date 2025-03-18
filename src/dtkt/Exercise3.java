package dtkt;

import java.util.Scanner;

public class Exercise3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();
        isCount(s);
    }

    static void isCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("Chuỗi không chứa kí tự in hoa ");
        }
    }
}

