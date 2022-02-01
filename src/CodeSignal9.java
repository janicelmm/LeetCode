
public class CodeSignal9 {

	public static String[] allLongestStrings(String[] inputArray) {

	    String l = ""; //full string with "-" separator
	    
	    for( String s: inputArray )
	    {
	        //length is first index of substring
	        //if list has same size strings, add this one
	        if( l.indexOf("-") == s.length() ) l += s + "-";
	        //reset if list has smaller strings
	        else if ( l.indexOf("-") < s.length() ) l = s + "-"; 
	    }
	    
	    return l.split( "-" );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(allLongestStrings(new String[] {"abc", "eeee", "abcd", "dcd"}));
	}

}
