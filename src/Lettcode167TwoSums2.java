import java.util.HashMap;

public class Lettcode167TwoSums2 {

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        
        for (int i = 0; i < numbers.length; i++)
        {
            if(!temp.containsKey(target - numbers[i]))
            {
                temp.put(numbers[i], i);
            }
            else
            {
                res[0] = temp.get(target - numbers[i]) + 1;
                res[1] = i + 1;
            }
        }
        return res;
    }
    
    public static int[] twoSum2(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        
        while(i < j)
        {
        	if (numbers[i] + numbers[j] > target)
        	{
        		j--;
        	}
        	else if (numbers[i] + numbers[j] < target)
        	{
        		i++;
        	}
        	else
        		break;
        }
        return new int[] {i + 1, j + 1};
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(twoSum2(new int[] {2,7,11,15}, 9));
	}

}
