package Functions;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num1=in.nextInt();
        fact(num1);
    }
    static void fact(int num1){
        int faaac=1;

        for(int i=1;i<=num1;i++){
            faaac=faaac*i;
        }
        System.out.println(faaac);

    }
}
class pallindrome{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int org = in.nextInt();
        int num1 = 0;
        num1=org;
        int rem=0;
        int rev=0;
        while (num1>0){
            rem=num1%10;
            rev=rev*10+rem;
            num1/=10;
        }
        if(org==rev){
            System.out.println("pallindrome");
        }else{
            System.out.println("ot");
        }
    }
}
