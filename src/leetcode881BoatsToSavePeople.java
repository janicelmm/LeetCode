import java.util.Arrays;

public class leetcode881BoatsToSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        int count = 0;
        int i = 0;
        int j = people.length - 1;
        Arrays.sort(people);
        
        while (i <= j)
        {
            count++;
            
            if (people[i] + people[j] <= limit)
            {
                i++;
            }
            
            j--;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(numRescueBoats(new int[] {3,2,2,1}, 3));
    }
}
