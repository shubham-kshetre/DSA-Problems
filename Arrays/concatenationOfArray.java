import java.util.Arrays;

public class concatenationOfArray{
    public static void main(String[] args) {
        int array[] = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(array)));
    }

    public static int[] getConcatenation(int[] nums) {
        int n =  nums.length; //3
        int ans[] = new int[2*n]; //6
        for (int i = 0; i < n; i++){
            ans[i] = nums[i];
        }
        for (int j= n;j < 2*n; j++){
            ans[j] = nums[j-n]; 
        }        
        return ans;        
    }
}