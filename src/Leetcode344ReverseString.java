
public class Leetcode344ReverseString {
    public static char[] reverseString(char[] s) {
       
        for (int i = 0; i < s.length/2; i++)
        {
            char c = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = c;
        }
        return s;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString(new char[]{'h','e', 'l', 'l', 'o'}));
	}

}
