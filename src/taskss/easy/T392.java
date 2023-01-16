package taskss.easy;

import java.util.HashMap;
import java.util.Map;

public class T392 {
    public boolean isSubsequence(String s, String t) {
        int j =0;
        if (s.equals("")){
            return true;
        }
        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i)==s.charAt(j)){
                j+=1;
            }
            if(j==s.length()){
                return true;
            }


        }

        return false;
    }
}
