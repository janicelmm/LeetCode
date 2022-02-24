public class Leetcode1423MaximumPtsYouCanObtainFromCards {
    public static int maxScore(int[] cardPoints, int k) {
        
        int total = 0;
        for (int i = 0; i < cardPoints.length; i++)
        {
            total += cardPoints[i];
        }
        
        int window = cardPoints.length - k;
        int windowSum = 0;
        
        for (int j = 0; j < window; j++)
        {
            windowSum += cardPoints[j];
        }
        
        int max = total - windowSum;
        
        for(int a = window; a < cardPoints.length; a++)
        {
            windowSum += cardPoints[a];
            windowSum -= cardPoints[a - window];
            max = Math.max(max, total - windowSum);
        }
        
        return max;
        
    }
    
    public static void main(String[] args) {
        System.out.println(maxScore(new int[] {1,2,3,4,5,6,1}, 3));
    }
}
