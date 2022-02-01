
public class CodeSignal10 {
	
	public static int commonCharacterCount(String s1, String s2) {
		int count = 0;

		for (int i = 0; i < s1.length(); i++)
		{
			if(s2.contains(String.valueOf(s1.charAt(i))))
			{
				count++;
				s2 = s2.replaceFirst(Character.toString(s1.charAt(i)), "-");
			}
		}
    
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(commonCharacterCount("aabcc", "adcaa"));
	}	

}
