package loops.medium;
import java.util.Scanner;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        int rem,ans=0;
        int org=0;

        num=org;
        while(num>0){
            rem=num%10;
            ans=(ans*10)+rem;
            num/=10;

        }
        System.out.println(ans);
        if(ans==org){
            System.out.println("pallindrone");
        }else{
            System.out.println("not");
        }



    }
}

class Palling {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str=in.nextLine();
        String org=str;
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if (org.equals(rev))
            System.out.println("pallinddrome");
        else
            System.out.println("not");



    }
}