
public class LeetCode605PlaceFowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int i = 0;
        
        while (i < flowerbed.length)
        {
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length -1 || flowerbed[i+1] ==0))
            {
            	flowerbed[i] = 1;
                n= n-1;
            }
            i++;
        }
        return n <= 0? true: false;
    }
    
    public static boolean canPlaceFlowers2(int[] flowerbed, int n) {
        int i = 0, count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            i++;
        }
        return count >= n;
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canPlaceFlowers(new int[] {0,0,1,0,1}, 2));
	}

}
