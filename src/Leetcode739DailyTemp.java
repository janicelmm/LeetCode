
public class Leetcode739DailyTemp {
    public static int[] dailyTemperatures(int[] temp) {
        int count = 1;
        int[] dt = new int[temp.length]; 
            
        for(int i = 0; i < temp.length-1; i++)
        {
            count = 1;
            for (int j = i+1; j < temp.length; j++)
            {
                if (temp[i] < temp[j])
                {
                    dt[i] = count;
                    break;
                }
                else 
                {
                    count++;
                }
            }

        }
        dt[temp.length - 1] = 0;
        
        return dt;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dailyTemperatures(new int[] {55,38,53,81,61,93,97,32,43,78}));
	}

}
//[73,74,75,71,69,72,76,73] [1,1,4,2,1,1,0,0]
