
public class Leetcode35SearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {
        
		int i = 0;
        int j = nums.length - 1;
        int mid = nums.length/2;
        
        while (i < j)
        {
            if (nums[mid] < target)
            {
            	i = mid + 1;     
            }
            else if (nums[mid] > target)
            {
                j = mid - 1;
            }
            else
            {
                return mid;
            }
            mid = (i+j)/2;
        }
        if (nums[nums.length - 1] < target)
        {
            return nums.length;
        }
        else 
        {
           return mid;
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(searchInsert(new int[] {1,3,5,6}, 2));
	}

}
