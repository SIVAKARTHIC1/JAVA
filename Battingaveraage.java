package loops.medium;

import java.util.Scanner;

public class Battingaveraage {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int noofbats=in.nextInt();
        int nofhits=in.nextInt();
        int battingavg = nofhits/noofbats;
        System.out.println(battingavg);
    }
}


/*class CGPACalculator{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int sum=0;
        for(int i=0;i<5;i++){
            System.out.println("enter the mark of subbject" +  (i+1));
            int res=in.nextInt();
            sum+=res;
        }
        int cgpa=sum/5;
        System.out.println(cgpa);
    }

}

 */
/*class sumofnnumbers{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}

 */