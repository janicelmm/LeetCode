
public class Leetcode1578MinTimeToMakeRopeColorful {
    public static int minCost(String colors, int[] neededTime) {
        int sum = 0;
        int prev = 0;
        
        for (int i = 1; i < colors.length(); i++)
        {
            if (colors.charAt(i) == colors.charAt(prev))
            {
                if (neededTime[i] >= neededTime[prev])
                {
                    sum += neededTime[prev];
                    prev = i;
                }
                else
                {
                    sum += neededTime[i];
                }
            }
            else
            {
                prev = i;
            }   
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(minCost("aaaaa", new int[] {1,2,3,4,5}));
    }
}
