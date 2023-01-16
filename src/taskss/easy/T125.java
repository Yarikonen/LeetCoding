package taskss.easy;

public class T125 {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        return (s.equalsIgnoreCase((new StringBuilder(s)).reverse().toString()));

    }
}
