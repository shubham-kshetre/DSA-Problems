
import java.util.Arrays;
public class countSmallerNums {
    public static void main(String[] args) {
       int[] nums = {8,1,2,2,3};
       System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));


    }
 
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length]; //to store count
        // to count less than numbers
        
        for (int i = 0; i< nums.length;i++){
            int count = 0;
            for (int j = 0; j< nums.length;j++){
                if (nums[j] < nums[i]){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;        
    }
       

    
}
