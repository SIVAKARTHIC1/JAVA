package flow;
import java.util.Scanner;


public class Interesst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("r=");
        float r= in.nextFloat();
        System.out.println("p=");
        int p= in.nextInt();
        System.out.println("t=");
        int t= in.nextInt();

        float a=p*(1+r*t);
        System.out.println(a);

    }
}
