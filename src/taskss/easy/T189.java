package taskss.easy;

public class T189 {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] newNumbers = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            if(i-k>=0){
                newNumbers[i]=nums[(i-k)%nums.length];
            }
            else{
                newNumbers[i]=nums[(nums.length-k+i)%nums.length];
            }

        }
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=newNumbers[i];

        }
    }
}
