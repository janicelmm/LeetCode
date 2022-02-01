import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Leetcode39CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        HashMap<Integer, LinkedList<List<Integer>>> combo = new HashMap<>();

        for (int i = 0; i < candidates.length; i++)
        {
        	for (int j = 1; j <= target; j++)
        	{
        		if (candidates[i] < j && combo.containsKey(j - candidates[i]))
        		{
        			LinkedList<List<Integer>> comboSums = combo.get(j - candidates[i]); 
        			for(List<Integer> comboSum : comboSums)
        			{
        				List<Integer> temp = new LinkedList<Integer>();
        				temp.add(candidates[i]);
        				temp.addAll(comboSum);
        				
        				LinkedList<List<Integer>> startComb = combo.getOrDefault(j, new LinkedList<List<Integer>>());
        				startComb.add(temp);
        				combo.put(j, startComb);
        			}
        		}
        		
        		if (candidates[i] == j)
        		{
        			List<Integer> start = new LinkedList<Integer>();
        			start.add(j);
        			
        			LinkedList<List<Integer>> startComb = combo.getOrDefault(j, new LinkedList<List<Integer>>());
        			startComb.add(start);
        			combo.put(j, startComb);
        		}
        	}
        }
        return combo.getOrDefault(target, new LinkedList<List<Integer>>());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println(combinationSum(new int[] {2,3,6,7}, 7));
	}

}
