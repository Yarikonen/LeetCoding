package taskss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class T228 extends AbstractTask{
    private Scanner sc;
    T228(){
        sc = new Scanner(System.in);
    }
    @Override
    void perform() {
        int length = sc.nextInt();
        List<Integer> nums2 = getArray(length);
        List<String> answer = new LinkedList<>();
        Integer[] nums = (Integer[]) nums2.toArray();
        Integer current=null;
        Integer previous = null;

        int j =0;
        for(int i=0;i<nums.length;i++){
            int start=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1])
                i++;

            if(start!=nums[i]){
                answer.add(""+start+"->"+nums[i]);
            }
            else{
                answer.add(""+start);
            }
        }


        }




    List<Integer> getArray(int length){
        List<Integer > list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            list.add(sc.nextInt());

        }
        return(list);

    }
}
