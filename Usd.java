package flow;
import java.util.Scanner;

public class Usd {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        float a = in.nextLong();
//        float b;
//        b = a / 83;
//        System.out.println(b);
        String s ="anagram";
        String t="nagaram";
        char[] ch=s.toCharArray();
        char[] ch1=t.toCharArray();
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(ch[i]==ch1[j]){
                    count++;
                    System.out.println(count);
                }
            }
        }
    }
}
