package loops.medium;

import java.util.Scanner;

public class Electriccitybill {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num1=in.nextInt();
        double bill=0;
        electricbill(num1,bill);
    }
    static void electricbill(int num1,double bill){
        if(num1<100){
            bill=num1*5;
            System.out.println(bill);
        } else if (num1 > 100 && num1 < 200) {
            bill=num1*5+40+(num1*0.15);
            System.out.println(bill);
        }else {
            System.out.println("enter units less than 200");
        }
    }
}

/*class Average{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int average=(num1+num2)/2;
        System.out.println(average);
    }
}

 */
