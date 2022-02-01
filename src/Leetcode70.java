
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(4));
	}
}
