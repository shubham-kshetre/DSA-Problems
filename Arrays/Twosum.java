// https://leetcode.com/problems/two-sum/description/
import java.util.Arrays;
public class Twosum {
    public static void main(String[] args) {
        int arr[] = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i<nums.length-1;i++){
            for (int k = i; k < nums.length; k++) {
                if (nums[i]+nums[k] == target){
                    ans[0] = i;
                    ans[1] = k;
                }                
            }

        }
        return ans;
        
    }
    
}
