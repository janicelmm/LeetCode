import java.util.Stack;

public class Leetcode20 {
	
	public static boolean isValid(String s) {
		if (s == " ")
		{
			return false;
		}
			
		Stack<Character> temp = new Stack <Character>();
			
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' )
			{
				temp.push(s.charAt(i));
			}
			else if (temp.size() == 0)				
			{
				return false;
			}
			else 
				{
					char openBracket = temp.pop();
					
					if ((openBracket == '[') && (s.charAt(i) != ']'))
					{
						return false;
					}
					else if ((openBracket == '(') && (s.charAt(i) != ')'))
					{
						return false;
					}
					else if ((openBracket == '{') && (s.charAt(i) != '}'))
					{
						return false;
					}	
				}
		}
			
		if (temp.size() > 0)
		{
			return false;
		}
		else
	    {
	        return true;
	    }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("{[(]})"));
	}

}
