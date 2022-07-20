// https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays; //for Arrays.toString() which is printing array given to it (internally using for loop)

public class ShuffleArray {
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,4,7};
        int n = arr.length;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int array[] = new int[n];
        int x = 0; // to use in array index for x1,x2,x3,...(we increment it to even access index in array)
        int y = 1; // to use in array index for y1,y2,y3...(we will increment to access odd index in array)  
        for (int i = 0; i<n/2 ;i++){
            array[x] = nums[i]; // x will 0,2,4,6.. and i will 0,1,2
            x += 2;           
        }
        for (int j=n/2; j<n;j++){
            array[y] = nums[j];  // y will  1,3,5... and j will 3,4,5
            y += 2;
        }        
        return array;        
    }
    
}
