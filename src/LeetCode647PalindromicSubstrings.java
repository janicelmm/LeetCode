
public class LeetCode647PalindromicSubstrings {
	public static int countSubstrings(String s) {
        int ans = 0;
       
        for (int i = 0; i < s.length(); i++)
        {
            ans += palindromCount(s, i, i);
            ans += palindromCount(s, i, i+1);
        }
        return ans;
    }
   
    public static int palindromCount(String s, int i, int j)
    {
    	int ans = 0;
	    while (i >= 0 && j <s.length())
	    {
	    	if (s.charAt(i) != s.charAt(j))
		    {
		        break;
		    }
		    ans++;
		    i--;
		    j++;
		}
	    return ans;
	}
    
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println(countSubstrings("abc"));
	}

}
