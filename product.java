package Functions;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        por(num1, num2);

    }

    static void por(int num1, int num2) {
        int ans = 0;
        ans = num1 * num2;
    }
}
class voting{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        vote(age);
    }
    static void vote(int age){
        if(age>=18){
                System.out.println("the person is eligible to vote");
        }else{
                System.out.println("not eligible");
        }
    }
}

class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i=1;i*i<=a;i++){
            if (i%a==0){
                System.out.println("not a pirne");
                return;
            }

        }
        System.out.println("prime");


    }
}

class priimme{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end=in.nextInt();
        for(int i=start;i<=end;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int num){
        for(int c=2;c*c<=num;c++){
            if(num%c==0){
                return false;
            }
        }
        return true;
    }

}


