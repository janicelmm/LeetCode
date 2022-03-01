import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Leetcode2150FinaAllLonelyNumbersInAnArray {
    public static List<Integer> findLonely(int[] nums) {
        
        List<Integer> i = new LinkedList<Integer>();
        Map<Integer, Integer> hs = new HashMap<>();
        
        for (int k : nums)
        {
            hs.put(k, hs.getOrDefault(k, 0) + 1);
        }
        
        for (int j : nums)
        {
            if (!hs.containsKey(j - 1) && !hs.containsKey(j + 1) && hs.get(j) == 1)
            {
                i.add(j);
            }
        }
        
        return i;
    }
    public static void main(String[] args) {
        System.out.println(findLonely(new int[] {1,3,5,3}));
    }

}
