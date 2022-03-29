import java.util.Arrays;

public class Leetcode1710MAxUnitsOnATruck {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int sum = 0;

        for (int i = 0; i < boxTypes.length; i++) 
        {
            if (truckSize >= boxTypes[i][0]) 
            {
                sum += boxTypes[i][1] * boxTypes[i][0];
                truckSize -= boxTypes[i][0];
            } 
            else if (truckSize > 0 && truckSize < boxTypes[i][0]) 
            {
                sum += truckSize * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(maximumUnits(new int[][] { { 5, 10 }, { 2, 5 }, { 4, 7 }, { 3, 9 } }, 10));
    }
}
