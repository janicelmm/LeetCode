
public class Leetcode704BinarySearch {

    public static int search(int[] nums, int target) {
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
        
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(search(new int[] {-1,0,3,5,9,12}, 2));
	}

}
