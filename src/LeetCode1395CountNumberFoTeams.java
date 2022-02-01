
public class LeetCode1395CountNumberFoTeams {
	public static int numTeams(int[] rating) {
		 
        int ans = 0;
        int min = rating[0];
        int max = rating[0];
        
        for (int i = 0; i < rating.length; i++)
        {
            int mincount = 1;
            int maxcount = 1;

            for (int j = i+1; j < rating.length; j++)
            {
                if (min < rating[j])
                {
                    min = Math.max(min, rating[j]);
                    mincount++;
                    maxcount = 1;
                }
                else if (rating[i] > max)
                {
                    max = Math.min(max, rating[j]);
                    maxcount++;
                    mincount = 1;
                }
                
                if (mincount >= 3 || maxcount >= 3)
                {
                    ans++;
                }
            }
        }
        return ans; 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numTeams(new int[] {2,5,3,4,1}));
		
	}

}
