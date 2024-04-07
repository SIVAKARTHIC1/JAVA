package Functions;

import java.util.Scanner;

public class Minmax {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        Min(num1, num2, num3);
        Max(num1,num2,num3);
    }

    static void Min(int num1, int num2, int num3) {
        int small = 0;
        if (num1 < num2 && num1 < num3) {
            small = num1;
        } else if (num1 > num2 && num2 < num3) {
            small = num2;
        } else {
            small = num3;
        }
        System.out.println(small);
    }
    static void Max(int num1,int num2,int num3){
        int large = 0;
        if(num1>num2 && num1>num3){
            large = num1;
        }else if(num1<num2 && num2>num3){
            large=num2;
        }else{
            large=num3;
        }
        System.out.println(large);
    }


}

