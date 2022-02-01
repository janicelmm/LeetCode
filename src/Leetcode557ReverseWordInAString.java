import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Leetcode557ReverseWordInAString {
    public static String reverseWords(String s) {
        String res = "";
        String[] words = s.split(" ");
        
        for (int i = 0; i < words.length; i++)
        {
        	String a = words[i];
        	for (int j = a.length() - 1; j >=0 ; j--)
        	{
        		res += a.charAt(j);
        	}
        	
        	if (i < words.length - 1)
        	{
            	res += ' ';
        	}
        }

        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("Let's take LeetCode contest"));
		System.out.println("Hi");
	}

}
