/*
 * Strategy: Use HashSet to store all the 'checked' index, so if it get to the same index, it can pass.
 * Use left and right to represent the two indexes from 'start'.
 * 
 */
import java.util.HashSet;

public class Leetcode1306JumpGameIII {
	public static HashSet<Integer> track = new HashSet<>();
	
	public static boolean canReach(int[] arr, int start) {
        if (arr[start] == 0)
        {
        	return true;
        }
        
        if (track.contains(start))
        {
        	return false;
        }
        
        track.add(start);
        
        boolean left = false;
        boolean right = false;
        
        if (start - arr[start] >= 0)
        {
        	left = canReach(arr, start - arr[start]);
        }
        
        if (start + arr[start] < arr.length)
        {
        	right = canReach(arr, start + arr[start]);
        }
        
        return left || right;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canReach(new int[] {4,2,3,0,3,1,2}, 5));
	}

}
