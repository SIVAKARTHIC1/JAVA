package javanesobasic;

import java.util.Scanner;

public class BAsic {
    public static void main(String[] args) {
        System.out.println(args[0]);     //print the argument in main class <run <edit configuration.
        Scanner in  =new Scanner(System.in);
        String name1 = in.next();




        String name2 = in.next();
        int age =in.nextInt();
        if(name1.equals("Male") && age>18){
            System.out.println("go to booth 1");
        } else if (name1.equals("Female")&& age>18) {
            System.out.println("go to booth 2");
        }
    }
}


/*
java comes in three editions
   *java standard edition  *java enterprise edition  * java micro edition
    -run on desktop         -run and to develop server side  -run on mobile application

    phascal case convention- ThisIsName(usually a class)
    camel case convention-thisIsName(usually method and we use in java)

system-printstream class; out-object; print-method;;

acess modifiers:
    public-can be accesed anywhere inside or outsode class and packages
    private- can be accesed only in class
    static - to call the method anywhere in the class(if we do not use class we unable to call xxx.)

cmd prompt
    my file name is main.java
    << javac main.java
    now the file is converted into the byte code
    << java main



 */
/*

 */











