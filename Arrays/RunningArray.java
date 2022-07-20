import java.util.Arrays;

public class RunningArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(array)));
    }

    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];
        int prev = 0;
        for (int i = 0; i < n;i++){
            sum[i] = prev + nums[i];
            prev = sum[i];
        } 
        return sum;
    }    
}
