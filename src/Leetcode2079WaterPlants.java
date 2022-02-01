
public class Leetcode2079WaterPlants {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int count = 0;
        int remaining = capacity;
        for (int i = 0; i < plants.length; i++)
        {
            if (remaining >= plants[i])
            {
                remaining -= plants[i];
                count++;
            }
            else
            {
                remaining = capacity - plants[i];
                count = count + 2*i + 1;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wateringPlants(new int[] {3,2,4,2,1}, 6));
	}

}
