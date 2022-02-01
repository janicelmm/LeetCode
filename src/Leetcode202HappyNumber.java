import java.util.HashSet;

public class Leetcode202HappyNumber {
    public static boolean isHappy(int n) {
    	HashSet<Integer> checked = new HashSet<Integer>();
        boolean result = false;

        while (n > 1)
        {
        	if (checked.contains(n))
        	{
        		return false;
        	}
        	else
        	{
        		checked.add(n);
                n = calculate(n);
        	}
        }

        if (n == 1)
        {
            result = true;
        }
        
        return result;
    }
    
    public static int calculate(int i){

        int sum = 0;
        
        while (i > 0)
        {
            sum += Math.pow(i%10, 2);
            i = i/10;
        }
        
        return sum;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(19));
	}

}
