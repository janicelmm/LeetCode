
public class Leetcode231PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
    	boolean res = false;
    	
        if (n == 1)
        {
            return true;
        }
        
        if (n % 2 == 0 && n != 0)
        {
        	n = n/2;
        	res = isPowerOfTwo(n);
        }
        
        return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(0));
	}

}
