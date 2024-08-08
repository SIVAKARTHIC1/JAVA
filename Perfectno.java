package loops.medium;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Perfectno {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(num==sum){
            System.out.println("it is a perfect number");
        }else{
            System.out.println("not a perfect number");
        }

    }
}

/*class Sum{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        int sum=0;
        int count=0;
        while(num>0){
            int rem =num%10;
            sum+=rem;
            count++;
            num/=10;
        }
        System.out.println(sum);
    }
}

 */