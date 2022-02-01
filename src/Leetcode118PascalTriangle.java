import java.util.LinkedList;
import java.util.List;

public class Leetcode118PascalTriangle {
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new LinkedList<List<Integer>>();

        int length = 0;
        
        while (numRows > 0)
        {
            List<Integer> layer = new LinkedList<Integer>(); 
            
            for (int i = 0; i <= length; i++)
            {
                if (i == 0 || i == length)
                {
                    layer.add(1);    
                }
                else
                {
                	int prevLayer = length - 1;
                	int firstIndex = i - 1;
                    layer.add(tri.get(prevLayer).get(firstIndex) + tri.get(prevLayer).get(i));
                }  
            }
            tri.add(layer);
            length++;
            numRows--;
        }
        return tri;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generate(5));
	}

}
