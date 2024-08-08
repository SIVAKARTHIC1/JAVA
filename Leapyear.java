package flow;
import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        leapOrnot(a);

    }
   static void leapOrnot(int a){
       if (a % 4==0 && a%100==0){
           System.out.println("it is leap year");
       }
       else{
           System.out.println("not leap year");
       }

   }

}
