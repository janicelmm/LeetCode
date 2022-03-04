
public class Leetcode70 {

    public static int climbStairs(int n) {
        if(n <= 2)
        {
            return n;
        }
        else
        {
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }
    
    public int climbStairs2(int n) {
        if(n <= 2)
        {
            return n;
        }
        
        int[] count = new int[n+1];
        
        for (int i = 0; i < count.length; i++)
        {
            if (i <= 2)
            {
                count[i] = i;
            }
            else
            {
                count[i] = count[i-1] + count[i-2];
            }
        }
        
        return count[n];
    }
    
	public static void main(String[] args) {
		System.out.println(climbStairs(10));
	}
}
