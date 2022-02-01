import java.util.HashSet;

public class CodeSignal7 {
//	public static boolean almostIncreasingSequence(int[] sequence) {
//		 for(int i = 0; i < sequence.length; i++)
//			{
//				
//				int prev = -100000;
//				boolean isSequence = true;
//				
//				for(int j = 0; j < sequence.length; j++)
//				{
//					if(i != j)
//					{
//	                    if( prev >= sequence[j])
//	                    {
//	                        isSequence = false;
//	                        break;
//	                    }
//	                    
//					    prev = sequence[j];
//					}
//				}
//				
//				if(isSequence == true)
//					return true;
//				
//			}
//			
//			return false;
//	}

	public static boolean almostIncreasingSequence2(int[] s) {

	    int last = Integer.MIN_VALUE;
	    int lastPrev = Integer.MIN_VALUE;
	    int c = 0;
	    
	    for (int n : s) {
	        if (n <= last) 
	        {
	            c++;
	            if (n > lastPrev) 
	            	last = n;
	        } 
	        else 
	        {
	            lastPrev = last;
	            last = n;
	        }
	    }
	    return c <= 1;   
	    		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(almostIncreasingSequence2(new int[] {10, 1, 2, 3, 4, 5}));
		//3, 5, 67, 98, 3
		//1, 2, 3, 4, 3, 6
	}

}
