public class Leetcode983MinCostForTickets {

	public static int mincostTickets(int[] days, int[] costs) 
	{	
		int[] travelCost = new int[days.length];
        int[] passDuration = {1, 7, 30};
        
        for (int i = 0; i < days.length; i++)
        {
        	int min = costs[2] + travelCost[Math.max(0, i-1)];
            for(int j = 0; j < costs.length; j++)
            {
            	int lastTravelled = -1;
                for(int k = i; k >=0; k--)
                {
                    if(days[k] <= Math.max(0, days[i] - passDuration[j]))
                    {
                        lastTravelled = k;
                        break;
                    }
                }
                
                if (lastTravelled != -1)
                {
                	min = Math.min(min, costs[j]+ travelCost[lastTravelled]);                	
                }
                else
                {
                	min = Math.min(min, costs[j]);
                }
            }
            travelCost[i] = min;   
        }
        return travelCost[days.length - 1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mincostTickets(new int[] {1,2,3,4,6,8,9,10,13,14,16,17,19,21,24,26,27,28,29}, new int[] {3,14,50}));
	}
}

//new int[] {1,2,3,4,6,8,9,10,13,14,16,17,19,21,24,26,27,28,29}, new int[] {3,4,50}))
//new int[] {1,4,6,7,8,20}, new int[] {2,7,15}));
//
