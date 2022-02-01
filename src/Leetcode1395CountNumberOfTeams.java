
public class Leetcode1395CountNumberOfTeams {
	public static int numTeams(int[] rating) {
		int ans = 0;
		
		for (int i = 0; i < rating.length; i++)
		{
			int l = 0;
			int r = 0;
			for (int j = 0; j < i; j++)
			{
				if (rating[j] < rating[i])
				{
					l++;
				}
			}
			
			for (int k = i+1; k < rating.length; k++)
			{
				if (rating[i] < rating[k])
				{
					r++;
				}
			}
			
			ans += l*r + (i-l)*(rating.length-1-i-r);
		}
		return ans;
		
	}
	        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numTeams(new int[] {2,5,3,4,1}));
	}

}
