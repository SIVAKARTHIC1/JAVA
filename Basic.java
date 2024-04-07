package Functions;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String message = greet();
        System.out.println(message);
    }

    static String greet() {
        String hi = "how";
        return hi;
    }

}

class Baasic {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int c=num.nextInt();
        int a,b;
        int message = greet(7,8);
        System.out.println(message);
    }

    static int greet(int a,int b) {
        int hi = a+b;
        return hi;
    }

}

/*class Scoping{
    public static void main(String[] args) {
        int a=1;
        you();
        {
            int c;
        }
        System.out.println(a);
        System.out.println(c);
        System.out.println(b);
    }
    static void you(){
        int a=12;
        int b;
        System.out.println(a);

    }
}
/*
 */

class Shadowing{
    static int x=10;//this will be shadowded
    public static void main(String[] args) {
        System.out.println(x);
        int x=40;
        System.out.println(x);
    }
}

class Vararg{
    public static void main(String[] args) {
        arg(12,32,14,13,35,3,3,53,23,31,1,135,3,511,1,135,31,51,15,13,51,5,15,15);

    }
    static void arg(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
class Overloading {
    public static void main(String[] args) {
        int d;
        fun(1, 3,2);
    }

    static void fun(int a, int b) {
        int h = a + b;
        System.out.println(h);
    }

    static void fun(int a, int b, int c) {
        int d = a + b * c;
        System.out.println(d);
    }
}