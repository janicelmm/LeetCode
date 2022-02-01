import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode841KeysAndRoom {

	public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
		
        HashSet<Integer> keysCollected = new HashSet<Integer>();
        Queue<Integer> keysUnlocked = new LinkedList<Integer>();
        
        keysCollected.add(0);
        keysUnlocked.add(0);
        
        while (!keysUnlocked.isEmpty()) 
        {
        	int keyToNextRoom = keysUnlocked.poll();        
        	
            for (int key : rooms.get(keyToNextRoom))
            {
            	if (!keysCollected.contains(key))
            	{
            		keysUnlocked.add(key);
            		keysCollected.add(key);
            	}
            } 	
        }
        
        return keysCollected.size() == rooms.size();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> a = new ArrayList<List<Integer>>();
		List<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(3);
		a.add(b);
		List<Integer> c = new ArrayList<Integer>();
		c.add(3);
		c.add(0);
		c.add(1);
		a.add(c);
		List<Integer> d = new ArrayList<Integer>();
		d.add(2);
		a.add(d);
		List<Integer> e = new ArrayList<Integer>();
		e.add(0);
		a.add(e);
		
		System.out.println(canVisitAllRooms(a));
	}

}
