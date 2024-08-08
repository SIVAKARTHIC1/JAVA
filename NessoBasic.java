package javanesobasic;
import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

import java.awt.*;
import java.lang.runtime.SwitchBootstraps;
import java.util.*;


public class NessoBasic {
    public static void main(String[] args) {
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Short.MAX_VALUE);
//        String in ="Siva karthic";
//        System.out.println(in.toUpperCase());
//        System.out.println(in);
//        System.out.println(in.length());
//        System.out.println(in.isEmpty());       //returns true if it is empty
//        System.out.println(in.isBlank());       // retuens true if it contains spacw and empty
//        System.out.println(in.charAt(3));
//        System.out.println(in.indexOf('i'));
//        System.out.println(in.lastIndexOf('i'));   //retrrn last index if i
//        System.out.println(in.concat(" its me "));
//        //concadintion in string
//        String s="siva";
//        String s2="swedha";
//        String s3 =s+" "+s2;
//        System.out.println(s3);
//        System.out.println("my favaorite number is "+1 +3);
//        System.out.println("siva"+"karthic"+3);
//        System.out.println("siva".concat("karthic").concat("5"));
//        Scanner inn =new Scanner(System.in);
//        int n =inn.nextInt();
//        switch (n%2){
//            case 0:
//                System.out.println("evem");
//            case 1:
//                System.out.println("odd");

//        Scanner in =new Scanner(System.in);
//        int n1=in.nextInt();
//        int n2=in.nextInt();
//        char ch =in.next().charAt(0);
//        if(ch=='+') {
//            System.out.println(n1 + n2);
//        }
//        else if(ch=='-'){
//                System.out.println(n1-n2);
//            }
//        else if(ch=='*'){
//            System.out.println(n1*n2);

        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        int res1, res2;
        res1 = n1 + n2;
        res2 = n3 + n4;
        if (res1 == res2) {
            System.out.println("it is lucky number");
        } else {
            System.out.println("not a luckyy number");

        }
    }
    /*
    varibles:
    * used to store something in cmputer mmory
    *each varible has a address
    *alloacating space to variable is called is called decleration
    *intialize varible;

    constants:
    *a varible whose value cannot be changed
    * we always use final keyword to intialize constants
    * it is always in capital lettr

    identifiers :
    * name of a class,methods,variables.
    * starts with _,$,letter
    *cannot start with digit and cannot contain spaces,in build java keyword.

    datatypes:
    *int ,char,string,boolean,float.
    * int = -2147483647 to 2147483647.{
    * byte=-128 to 127.                                     calculating a rannge of variable formula (-2^no of bits -1),(-2^no of bits -1)-1
    * short = -32768 to 32767
    * long= greatest of all.(last put L)

    byte<short<int<long.
    type conveersion =left side to equal element must larger in size.
    }

    * bit is the smallest unit of memory.
    * a byte is equal to 8bits.
    * shrot=2bytes; int = 4bytes; long = 8bytes; double = 8byte; float = 4 byttes;(last put F)


*java uses a uni code representation(\u0047)
* size of boolean depends on jvm

*when we modify new string using method ie).touppercase new string is created not the original string is modified

primitive vs reference variable:
    1. in primitive new object is created
        s1=5;
        s2=5;       *both are different objects
    2. in reference new address is created pointing to the object
            s1-> "hello"
            s2->"hello"     *in this case both are poimting towards the same onject

intanstiating =  creating a object with "new" method

Immutable objects:
    * string are immutable whose content cannot be changed and string classes are also immutable whose content cannot be changed;
     s1-> "hello"
      s2->"hello"
      if me modify s2 ,s1 will not be changed because strings are immutable


literals: it is a constant keyword that appear directly in a programme ie) inside " " ' ' etc...


Cassting:
    implicit casting: automaticlly complier will convert left value should be greeater .double can store int,float... long can store int

    explicit casting: we need to convert code
            int i=4L //error so,
            int = (int) 4L

only larger value should be assigned smaller value



Scoping =  global and local

method

pass by value:
psvm{
    int x=1;
    change(x);          => 2,1
    sout(x);                both int x are diffferent
int change(int x){
    x=2;
    return x;
    }

pass by reference:
    here we point class

Point p=new point();
p1.x=1;
 sout(x);                =>2,2
int change(p1.x){           here address of p1 is pointing
    x=2;
    return x;
    }


method overloading = void(int x,int y)   void(int x,int y,intz)

Arrays:
    group contains smae data
    when aray is creted in contains int=0; char=\u0000; boolean=false; null for refernce types

    in array are passed by reference so if we change array in method original aray is also cahnged

Array class
    sort(array)     sort(array,from index ,to end index-1)
        we cannot apply sort on points class but we can apply sort on String because
        string class has built in comaoreTo method but points class does not have

    Searching:
        binarySearch(array,element)
        return the index value of element if the ele was not found return correc insert
            posistion of ele +1 and give the value in -ve

         same for string and points like sort.

     compare:
            .equals()

     fillmethod:
            .fill(array,value)

     variable length argument length:
                int...array name


     */


}

class Aray{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
       // new int[] {1,2,3,4,5};
        //printArray(new int[] {1,2,3,4,5});

        Point p =getPont();
        System.out.println(p);
        int [] num=get();
        System.out.println(num); //address printed
        //printArray(num); //array is printeed

        int [] sss={4,324,2,532,452,};
        Arrays.sort(sss);
        System.out.println(Arrays.toString(sss));

        char[] cc ={'a','d','g','t','A','F','G','R'};
        Arrays.sort(cc);
        System.out.println(Arrays.toString(cc)); //it is sorted on based on unicodes

        int [] aa={2,5,1,4,2,4,2,};
        Arrays.sort(aa,1,6);
        System.out.println(Arrays.toString(aa));


        System.out.println(Arrays.binarySearch(aa,4));
        System.out.println(Arrays.binarySearch(aa,6)); //-8

        System.out.println(Arrays.equals(aa,sss));
        String str1=new String("hello");
        String str2=new String("hello");
        System.out.println(str1.equals(str2));

        int [] arrr=new int[7];
        //Arrays.fill(arrr,3);
        //System.out.println(Arrays.toString(arrr));
        Arrays.fill(arrr,2,6,1);//0 0 1 1 1 1 0
        System.out.println(Arrays.toString(arrr));

        Point[] aq=new Point[3];
        Arrays.fill(aq,0,2,new Point(1,2));


        ArrayList<Integer> integers= new ArrayList<>();
        integers.add(5);
        integers.add(4);
        System.out.println(integers);
        integers.add(2,100);
        System.out.println(integers.get(1));   //ge the value
        integers.set(0,233);   //change the value at 0th index  stings are immmutable so address of pointer will change
        System.out.println(integers);
        System.out.println(integers.remove(1));  //remove by index
        // integers.clear(); //clear all the element
        System.out.println(integers.size());
        integers.add(4);
        integers.add(67);

        Collections.sort(integers);
        System.out.println(integers);   //sort the element in ascending order

        ArrayList<Integer> items=new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(4);
        items.add(2);
        int [] arr = {1,3,5,7,8};
        for (int item: items ){
            System.out.println(item + " ");
        }
        for (int i : arr){
            System.out.println(i +" ");
        }

    }


    public static Point getPont(){    //if we pass int in the example it is dead
        return new Point(1,2); //after the function overs unless points never dies after getpoint method over
    }
    public static int [] get(){
        return new int[] {1,2,3,4,5};
    }

}



/*
two dimensional array:
    int[][] arr={{3,42},{4,2}};
    in 2d array if we use arrays.tostring method it will print only address so new method is called Arrays.deepToString

    in methods write return new int[][] {{1,3,4} {4,5,3} {4,3,2}}

Array list:
    a resizeable array
    ArrayList<Integer> integers;
    integers = new ArrayList<>():        ArrayList<Integer> integers= new ArrayList<>():

    cannot store int char so we add wrapper class like Integer

for each loop:

    for(type var name : ArrayList/Array){
        ....
    }
 */


