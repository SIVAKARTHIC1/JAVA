package Array.Easy;

import java.util.Arrays;

public class Smallestelement {
    public static void main(String[] args) {
        int[] arr={8,1,2,2,3};
        int [] newarr=new int[arr.length];

        for (int i=0;i<=arr.length-1;i++){
            int small=0;
            for (int j=1;j<=arr.length-1;j++){
                if (arr[i]>arr[j]){
                    small++;
                }

            }
            newarr[i]=small;
        }
        System.out.println(Arrays.toString(newarr));
    }
}
