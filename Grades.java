package Functions;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        if (num1 > 100) {
            System.out.println("enter within 100");
            return;
        }
        mark(num1);
    }

    static void mark(int num1) {
        int gra = 0;
        if (num1 <= 40) {
            System.out.println("fail");
        } else if (num1 >= 41 && num1 <= 50) {
            System.out.println("DD");
        } else if (num1 >= 51 && num1 <= 60) {
            System.out.println("Cd");
        } else if (num1 >= 61 && num1 <= 70) {
            System.out.println("bc");
        } else if (num1 >= 71 && num1 <= 80) {
            System.out.println("bb");
        } else if (num1 >= 81 && num1 <= 90) {
            System.out.println("ab");
        } else if (num1 >= 91 && num1 <= 100) {
            System.out.println("aa");
        }
    }
}