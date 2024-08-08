package loops.medium;

import java.util.Scanner;

public class lcmhcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int hcf = 1;
        int min = Math.min(num1, num2);
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                hcf = i;
        }
        System.out.println(hcf);
    }
}

/*class lcm{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int gcd=1;
        int min=Math.min(num1,num2);
        for(int i=1;i<=min;i++){
            if (num1%i==0&&num2%i==0){
                gcd=i;
            }
        }
        int lcm=(num1*num2)/gcd;
        System.out.println(lcm);
    }
}


 */

