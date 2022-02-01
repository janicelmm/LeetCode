
public class LeetCode1375bulb3 {
	
	public static int numTimesAllBlue(int[] light) {
        int count = 0;
        boolean[] temp = new boolean[light.length];
        int allblue = 0;
        int max = 0;

        for(int i = 0; i < light.length - 1; i++)
        {
            temp[light[i]-1] = true;
            count = 0;
            max = Math.max(max, light[i]-1);
            int k = 0;
            
            if(light[i]-1 == 0)
            {
            	while(k <= max)
            	{
            		if(temp[k] == true)
            		{
            			count++;
            		}
            		k++;
            	}
            }
 
            for(int j = 0; j < light[i]-1; j++)
            {
                if (temp[j] == true)
                {
                    count++;
                }
            }
            
            if (count == light[i]-1)
            {
                allblue++;
            }
        }
        return allblue;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numTimesAllBlue(new int[] {1,2,3,4}));
	}

}
