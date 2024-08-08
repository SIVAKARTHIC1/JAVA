package Array.Easy;

import java.util.Arrays;

/*public class Shuffle {
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        int x1,x2,x3,y1,y2,y3;
        x1=arr[0];
        x2=arr[1];
        x3=arr[2];
        y1=arr[3];
        y2=arr[4];
        y3=arr[5];
        int[]res={x1,y1,x2,y2,x3,y3};
        System.out.println(Arrays.toString(res));
    }
}


 */
public class Shuffle{
    public static void main(String[] args) {
        int [] nums={2,5,1,3,4,7};
        int n=3;
        int[] arr=new int[nums.length];
        for (int i=0;i<n;i++){
            arr[2*i]=nums[i];
            arr[2*i+1]=nums[i+n];
        }
        System.out.println("the reversed array is");
        for (int i : arr) {
            System.out.print(i);
        }

    }
}

class Candies{
    public static void main(String[] args) {
        int[] arr={1,5,3,4};
        boolean [] res=new boolean[arr.length];
        for (int i :arr){
            System.out.println(res[i]=candies(arr));
        }


    }
    static boolean candies(int[] arr){
        int extracndies=3;
        for (int i=0;i<=arr.length;i++){
            if(arr[i]>extracndies){
                return true;
            }

        }
        return false;
    }
}