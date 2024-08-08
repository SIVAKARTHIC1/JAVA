package loops.medium;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int rem;
        int rev=0;
        int count=0;
        int am=0;
        int ans;
        while(n>0) {
            rem = n % 10;
            am= (int) (am+Math.pow(rem,3));

            count++;
            n = n / 10;
        }
        System.out.println(am);
        while(n!=0) {

            count++;
            n = n / 10;
        }
    }



}
