public class leetcode1052GrumpyBookstoreOwner {
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int total = 0;
        
        for (int i = 0; i < grumpy.length; i++)
        {
            if (grumpy[i] == 0)
            {
                total += customers[i];
            }
            else
            {
                grumpy[i] = customers[i];
            }
        }
        
        int extra = 0;
        for (int j = 0; j < minutes; j++)
        {
            extra += grumpy[j];
        }
        
        int ans = extra;
        for (int k = minutes; k < grumpy.length; k++)
        {
            extra += grumpy[k];
            extra -= grumpy[k - minutes];
            ans = Math.max(ans, extra);
        }
        
        return ans + total;
    }
    public static void main(String[] args) {
        System.out.println(maxSatisfied(new int[] {1,0,1,2,1,1,7,5}, new int[] {0,1,0,1,0,1,0,1}, 3));
    }

}
