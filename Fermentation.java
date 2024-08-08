package Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;

public class Fermentation {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 5, 3, 4};
        int[] no = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            no[i] = arr[arr[i]];
        }

        System.out.println(Arrays.toString(no));
    }
}


class concadination{
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] ans =new int[2*arr.length];
        for (int i=0;i<=arr.length-1;i++){
            ans[i]=arr[i];
        }
        for (int i=0;i<=arr.length-1;i++){
            ans[i+arr.length]=arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}

