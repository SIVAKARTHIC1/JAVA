package loops.medium;

import java.util.Scanner;

public class Qno26 {

        public static void main(String[] args) {
            Scanner in =new Scanner(System.in);

            int sumpositive=0;
            int sumnegative=0;
            int sumodd=0;
            while(true){
                int n=in.nextInt();
                if(n==0){
                    break;
                }else if(n%2==0){
                    sumpositive+=n;
                }else if(n<0){
                    sumnegative+=n;
                }
                else{
                    sumodd+=n;
                }
            }


            System.out.println(sumnegative);
            System.out.println(sumodd);
            System.out.println(sumpositive);
        }

}
