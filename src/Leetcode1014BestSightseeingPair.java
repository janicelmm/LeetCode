
public class Leetcode1014BestSightseeingPair {
    public static int maxScoreSightseeingPair(int[] values) {
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < values.length; i++)
        {
            b = Math.max(b, values[i] - i + a);    
            a = Math.max(a, values[i] + i);
        }
        return b;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxScoreSightseeingPair(new int[] {8,1,5,2,6}));
	}

}
