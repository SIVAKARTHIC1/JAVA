package Array.Easy;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Targetarray {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        List<Integer> target = new ArrayList<Integer>();
        for (int i=0;i<nums.length;i++){
            target.add(index[i],nums[i]);
        }
        int [] res =new int[nums.length];
        for (int i=0;i<target.size();i++){

            res[i]=target.get(i);
        }
        System.out.println(Arrays.toString(res));
    }
}



