import java.util.HashMap;

public class Leetcode1143 {
	public static int longestCommonSubsequence(String text1, String text2) {
        int count = 0;
        String s = text2;
        
        for (int i = 0; i < text1.length(); i++)
        {
        	if (s.contains(String.valueOf(text1.charAt(i))))
            {
                count++;
                s = s.substring(s.indexOf(text1.charAt(i)) + 1, s.length());
            }
        }
        
        int max = count;
        count = 0;
        s = text1;
        for (int j = 0; j < text2.length(); j++)
        {
        	if (s.contains(String.valueOf(text2.charAt(j))))
            {
                max = Math.max(max, count++);
                s = s.substring(s.indexOf(text2.charAt(j)) + 1, s.length());
            }
        }
        
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestCommonSubsequence("oxcpqrsvwf", "shmtulqrypy"));
	}

}
