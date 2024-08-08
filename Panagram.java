package Array.Easy;

import java.util.Scanner;

public class Panagram{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.next();
        System.out.println(panagram(s.toLowerCase()));
    }
    static boolean panagram(String s){
        if (s.length()<26){
            return false;
        }
        else{
            for (char ch='a';ch<'z';ch++){
                if (s.indexOf(ch)<0){
                    return false;
                }
            }
        }
        return true;
    }
}
