import java.util.Arrays;

public class BuildArrayFromPermutation{
    public static void main(String[] args) {
        int[] array = {0,2,1,5,3,4};        
        System.out.print(Arrays.toString(buildArray(array)));
    }
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        System.out.println(n); //length of array is number of elements we can store in it.
        int ans[] = new int[n]; // nums will store n elements
        for (int i = 0; i<n;i++){ //but last index of nums will be n-1
            ans[i] = nums[nums[i]];
        }
        return ans;
            
    }
}