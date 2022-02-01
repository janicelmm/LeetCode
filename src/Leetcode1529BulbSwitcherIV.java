
public class Leetcode1529BulbSwitcherIV {
    public static int minFlips(String target) {
        
        int count = 0;
        
        if (target.charAt(0) != '0')
        {
            count++;
        }
        for (int i = 1; i < target.length(); i++)
        {
            if (target.charAt(i) != target.charAt(i-1))
            {
                count++;
            }
        }
        return count;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minFlips("00000"));
	}

}
