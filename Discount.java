package loops.medium;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter ruppes");
        int num=in.nextInt();
        System.out.println("enteer percnetage discount");
        int dis=in.nextInt();
        int res=discount(num,dis);
        int discountpice=num-res;
        System.out.println(discountpice);
    }
    static int discount(int num,int dis){
        return (num*dis)/100;
    }

}

/*class distance{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the coordinates of x");
        int x1=in.nextInt();
        int x2=in.nextInt();
        System.out.println("enter the coordinates of y");
        int y1=in.nextInt();
        int y2=in.nextInt();
        int x=x2-x1;
        int y=y2-y1;
        double num1=Math.pow(x,2);
        double num2=Math.pow(x,2);
        double res=num1+num2;
        double distance=Math.sqrt(res);
        System.out.println(distance);

    }
}

 */

/*public class DistanceCalculator {
    public static void main(String[] args) {
        int x1 = 4, y1 = 5; // Coordinates of the first point
        int x2 = 3, y2 = 4; // Coordinates of the second point

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the two points is: " + distance);
    }
}

 */

/*class commision{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        int rate=in.nextInt();
        int total=num*rate;
        System.out.println("the commision rate is" +total);

    }
}
 */


//depreciation value = (purchase price -salvage value) /year of service