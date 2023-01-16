package taskss.easy;

import java.util.Arrays;

public class T724 {
    public int pivotIndex(int[] nums) {
        int a = Arrays.stream(nums).sum();
        int sum =0;
        for (int i = 0; i <nums.length ; i++) {
            if (sum==(a-nums[i]-sum)){
                return i;
            }
            if(sum>(a-nums[i]-sum)){
                return -1;
            }
            sum+=nums[i];

        }
        return -1;
    }
}
