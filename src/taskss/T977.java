package taskss;

import java.util.LinkedList;
import java.util.List;

public class T977 {
    public int[] sortedSquares(int[] nums) {
        List<Integer> newList = new LinkedList<>();
        for (int a: nums
             ) {
            newList.add(a*a);

        }

        return newList.stream().sorted().mapToInt(i->i).toArray();

    }
}
