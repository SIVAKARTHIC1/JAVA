package loops.medium;

import java.util.Scanner;

public class Ncrandnpr {
    public static void main(String[] args) {
        Scanner i =new Scanner(System.in);
        int n=i.nextInt();
        int r=i.nextInt();
        int npr=factorial(n)/factorial(n-r);
        int ncr=factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(ncr);
        System.out.println(npr);

    }
    static int factorial(int num){
        int fact=1;
        for (int i=1;i<num;i++){
            fact*=i;
        }
        return fact;
    }
}
// A = P(1 + r/n)^(nt)   compound intereestt formula