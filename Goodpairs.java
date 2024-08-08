package Array.Easy;

import javax.swing.*;

public class Goodpairs {
    public static void main(String[] args) {
        int [] arr={1,1,1,1};
        int count=0;
        for (int i=0;i<=arr.length-1;i++){
            for (int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

        }
        System.out.println(count);
    }


    
}
