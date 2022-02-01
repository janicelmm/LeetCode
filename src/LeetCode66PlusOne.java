
public class LeetCode66PlusOne {
	public static int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        
        for (int i = n; i >= 0; i--)
        {
        	if(digits[i] < 9)
        	{
        		digits[i]++;
        		return digits;
        	}
        	
        	digits[i] = 0;
        }
        
        int[] plusOne2 = new int[n+2];
        plusOne2[0] = 1;
        return plusOne2;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(plusOne(new int[] {9}));
	}

}
