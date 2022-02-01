import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leetcode349Intersectionof2Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        int count = 0;
        
        for(int i = 0; i < nums1.length; i++)
        {
            temp.put(nums1[i], 1);
        }
        
        for(int j = 0; j < nums2.length; j++)
        {
            if (temp.containsKey(nums2[j]))
            {
                if(temp.get(nums2[j]) != 0)
                {
                    temp.put(nums2[j], 0);
                    count++;
                }
            }
        }
        
        int[] result = new int[count];
        
        for(int a = 0; a < count; a++)
        {
        	for (int b = 0; b < nums1.length; b++)
        	{
        		if (temp.get(nums1[b])==0)
        		{
        			result[a] = nums1[b];
        		}
        	}
        }
        
        return result;
    }
    
    public static int[] intersection2(int[] nums1, int[] nums2) {
        
        Set<Integer> temp = new HashSet<Integer>();
        Set<Integer> temp2 = new HashSet<Integer>();
                
        for(int i = 0; i < nums1.length; i++)
        {
            temp.add(nums1[i]);
        }
        
        for(int j = 0; j < nums2.length; j++)
        {
            if (temp.contains(nums2[j]))
            {
                temp2.add(nums2[j]);
            }
        }
        int count = temp2.size();
        int[] result = new int[count];
        
        for(int k : temp2)
        {
        	result[count-1] = k;
        	count--;
        }
        
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intersection(new int[] {1,2,2,1}, new int[] {2,2}));
	}

}
