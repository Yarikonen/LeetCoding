package taskss.easy;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class T205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> ans = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (ans.containsKey(s.charAt(i))) {
                if (t.charAt(i) != ans.get(s.charAt(i)))
                    return false;
            } else {
                if (ans.containsValue(t.charAt(i)))
                    return false;
                ans.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;


    }
}
