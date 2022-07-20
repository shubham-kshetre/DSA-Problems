// https://leetcode.com/problems/richest-customer-wealth/

public class RicchestCustomer {
    public static void main(String[] args) {
    int[][] arr = {{1,2,3},{3,2,1}};
    System.out.println(maximumWealth(arr));

        
    }
    public static int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int max = 0; //if max is declared in for loop then we can not access it outside of loop so declared here
        for (int i = 0; i < m; i++){
            int sum = 0; //sum should be 0 for each ith array so deaclared here
            int n = accounts[i].length;
            for (int j = 0; j < n; j++){
                sum = sum + accounts[i][j];
            }
            if (sum >= max){ //it will check sum of each ith array
                max = sum;
            }
        }
        return max;
    }
    
}
