
public class Leetcode167TwoSumsII {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        
        while (i < j)
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
            {
                break;
            }
        }
        
        return new int[]{i+1, j+1};
    }
    
    public static void main(String[] args) {
        System.out.println(twoSum(new int[] {2,7,11,15}, 9));
    }
}
