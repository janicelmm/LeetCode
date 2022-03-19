import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Leetcode9PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        
        for (int i = 0; i < s.length()/2; i++)
        {
            if (s.charAt(i) != s.charAt(s.length()-1-i))
            {
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean isPalindrome2(int x) {
        if (x < 0) 
        {
            return false;
        }
        
        Stack<Integer> s = new Stack<>();
        List<Integer> l = new LinkedList<>();
        
        while (x != 0)
        {
            s.push(x%10);
            l.add(x%10);
            x = x/10;
        }
        
        for (int i = 0; i < l.size(); i++)
        {
            if (s.pop() != l.get(i))
            {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrome2(121));
    }
}
