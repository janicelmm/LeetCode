
public final class Leetcode6 {
    public static String convert(String s, int numRows) {
        	String result = "" + s.charAt(0);
            int i = 0;
            int place = 0;
            
            while ((place*i) <= s.length())
            {
            	place = i+2*numRows-2;
                result += s.charAt(place);
                i++;
            }
        return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("PAYPALISHIRING",3));
	}

}
