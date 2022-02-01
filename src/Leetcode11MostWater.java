
public class Leetcode11MostWater {
	 public static int maxArea(int[] height) {
		 int max = 0;
		 int L = 0;
		 int R = height.length - 1;
		 
		 for(int i = 0; i < height.length; i++)
		 {
			 for (int j = i + 1; j < height.length; j++)
			 {
				 max = Math.max(max, Math.min(height[i],  height[j]) * (j - i));
			 }
		 }
		 return max;
		 
//   	    int max = 0;
//	        int L = 0;
//	        int R = height.length - 1;
//	        
//	        while(L < R)
//	        {
//	            max = Math.max(max, Math.min(height[L],height[R])*(R-L));
//	            
//	            if (height[L]<height[R])
//	            {
//	            	L = L+1;
//	            }
//	            else
//	            	R = R-1;
//	        }
//	             
//	        return max;
	 }
	 
	 public static int maxArea2(int[] height) {
		 int left = 0;
		 int right = height.length - 1;
		 int max = 0;

		 while (left < right)
		 {
			 if (height[left] < height[right])
			 {
				 max = Math.max(max, (right- left) * height[left]);
				 left++;
			 }
			 else
			 {
				 max = Math.max(max, (right- left) * height[right]);
				 right--;
			 }
		 }
		 return max;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxArea2(new int[] {1,8,6,2,5,4,8,3,7}));
	}

}
