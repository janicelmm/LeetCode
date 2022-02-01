import java.util.HashSet;

public class Leetcode1346CheckFiDoubleExists {

    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i : arr)
        {
            if (hs.contains(i*2) || (i%2 == 0 && hs.contains(i/2)))
            {
                return true;
            }
            else
            {
                hs.add(i);            
            }
        }
        return false;
    }
    
    public static boolean checkIfExist2(int[] arr) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i : arr)
        {
            if (!hs.contains(i*2) && (i%2 == 0 && !hs.contains(i/2)))
            {
            	hs.add(i); 
            }
            else
            {
            	return true;
            }
        }
        return false;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkIfExist2(new int[] {3,1,7,4}));
	}

}
