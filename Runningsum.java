package Array.Easy;

import java.util.Arrays;

public class Runningsum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};

        for (int i=1;i<=arr.length-1;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
}


/*class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {                  //code needs to study
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {1, 2, 4}};
        RichestCustomerWealth rcw = new RichestCustomerWealth();
        int richestWealth = rcw.maximumWealth(accounts);
        System.out.println("The richest customer's wealth is: " + richestWealth);
    }
}



 */
