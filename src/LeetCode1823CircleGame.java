import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode1823CircleGame {

	public static int findTheWinner(int n, int k) {
        List<Integer> frds = new ArrayList<Integer>();
        
        for (int i = 1; i <= n; i++)
        {
            frds.add(i);
        }
        
        int count = k;
		
		while(frds.size() > 1)
		{
			int removed = frds.remove(0);
			count--;
			
			if (count == 0)
			{
				count = k;
			}
			else
			{
				frds.add(removed);
			}
		}
        
        return frds.get(0);
    }
	
	 public int findTheWinner2(int n, int k) {
	        Queue<Integer> queue = new LinkedList<>();
	        for(int i=1;i<=n;i++){
	            queue.offer(i);
	        }
	        
	        while(queue.size()>1){
	            int delete = k-1;
	            while(delete>0){
	                queue.offer(queue.remove());
	                delete--;
	            }
	            
	            queue.remove();
	        }
	        
	        return queue.remove();
	    }
	
	public static void remove(List<Integer> frds, int k)
	{
        int count = 1;
        
        while (frds.size() > 1)
        {
			for (int i = 0; i < frds.size(); i++)
			{
				if (frds.get(i) != 0)
				{
					if (count == k)
					{
		            	frds.set(i, 0);
		                count = 1;
					}
					else
					{
						count++;
					}
				}
			}
			
			for (int i = 0; i < frds.size(); i++)
			{
				if (frds.get(i) == 0)
	            {
	            	frds.remove(i);
	            }
			}
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findTheWinner(6,5));
	}

}
