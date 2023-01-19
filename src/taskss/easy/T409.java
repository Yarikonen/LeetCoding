package taskss.easy;

import java.util.*;

public class T409 {
    public int longestPalindrome(String s) {
        int summ=0;
        int max=0;
        boolean was=false;
        int[] a = new int[256];
        Arrays.fill(a,0);
        for (int i = 0; i < s.length(); i++) {
           a[s.charAt(i)]+=1;

        }
        for (int i: a
             ) {
            if(i%2==0){
                summ+=i;
            }
            else{
                summ+=i-1;
                was=true;

            }

        }
        return(summ+ (was  ? 1 : 0));

    }
}
