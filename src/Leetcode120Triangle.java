import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode120Triangle {

	public static int minimumTotal(List<List<Integer>> triangle) {

        for (int i = 1; i < triangle.size(); i++)
        {
        	for(int j = 0; j < triangle.get(i).size(); j++)
        	{
        		int sum = 0;
        		if(j == 0)
        		{
        			sum += triangle.get(i).get(j) + triangle.get(i - 1).get(j);
        		}
        		else if(j == triangle.get(i).size() - 1)
        		{
        			sum += triangle.get(i).get(j) + triangle.get(i - 1).get(j - 1);
        		}
        		else
        		{
        			sum += triangle.get(i).get(j) + Math.min(triangle.get(i-1).get(j), triangle.get(i-1).get(j - 1));
        		}
        		triangle.get(i).set(j,  sum);
        	}
        }
        return Collections.min(triangle.get(triangle.size() - 1));
    }
	
	public static int minimumTotal2(List<List<Integer>> triangle) {

        for (int i = triangle.size()-2; i >=0 ; i--)
        {
        	for(int j = 0; j < triangle.get(i).size(); j++)
        	{
        		int sum = 0;
        		sum += Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)) + triangle.get(i).get(j);
        		triangle.get(i).set(j,  sum);	
        	}
        }
        return triangle.get(0).get(0);
    }
	
	public static int minimumTotal3(List<List<Integer>> triangle) {
		for (int i = triangle.size() - 2; i >= 0; i--)
		{
			for (int j = 0; j < triangle.get(i).size(); j++)
			{
				int sum = 0;
				sum += triangle.get(i).get(j) + Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1));
				triangle.get(i).set(j, sum);
			}
		}
		return triangle.get(0).get(0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> a = new ArrayList<List<Integer>>();
		  List<Integer> b = new ArrayList<Integer>();
		  b.add(2);
		  a.add(b);
		  List<Integer> c = new ArrayList<Integer>();
		  c.add(3);
		  c.add(4);
		  a.add(c);
		  List<Integer> d = new ArrayList<Integer>();
		  d.add(6);
		  d.add(5);
		  d.add(7);
		  a.add(d);
		  List<Integer> e = new ArrayList<Integer>();
		  e.add(4);
		  e.add(1);
		  e.add(8);
		  e.add(3);
		  a.add(e);
		  System.out.println(a);
		  System.out.println(minimumTotal3(a));
	}
	
	//[[-1],[2,3],[1,-1,-3]]
	//{{2},{3,4},{6,5,7},{4,1,8,3}

}
