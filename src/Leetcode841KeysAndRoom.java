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

    public static boolean canVisitAllRooms2(List<List<Integer>> rooms) {
        Queue<List<Integer>> keys = new LinkedList<>();
        HashSet<Integer> unopen = new HashSet<>();
        HashSet<List<Integer>> keysUsed = new HashSet<>();

        for (int i = 1; i < rooms.size(); i++) 
        {
            unopen.add(i);
        }

        keys.offer(rooms.get(0));

        while (!keys.isEmpty()) 
        {
            List<Integer> i = keys.poll();

            if (!keysUsed.contains(i)) 
            {
                keysUsed.add(i);
            }

            for (Integer key : i) 
            {
                if (!keysUsed.contains(rooms.get(key))) 
                {
                    keys.offer(rooms.get(key));
                }
                
                unopen.remove(key);
            }
        }

        return unopen.size() == 0;
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

        List<List<Integer>> a2 = new ArrayList<List<Integer>>();
        List<Integer> b2 = new ArrayList<Integer>();
        b2.add(1);
        a2.add(b2);
        List<Integer> c2 = new ArrayList<Integer>();
        c2.add(2);
        a2.add(c2);
        List<Integer> d2 = new ArrayList<Integer>();
        d2.add(3);
        a2.add(d2);
        List<Integer> e2 = new ArrayList<Integer>();
        a2.add(e2);
        System.out.println(canVisitAllRooms2(a));
    }
}
