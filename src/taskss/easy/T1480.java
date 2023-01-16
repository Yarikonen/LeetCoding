package taskss.easy;

public class T1480 {
    public int[] runningSum(int[] nums) {
        int[] result =new int[nums.length];
        result[0]=nums[0];
        for (int j = 1; j < nums.length; j++) {
            result[j]=nums[j]+result[j-1];


        }
        return result;

    }
}
