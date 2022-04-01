public class Leetcode860LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {

        int five = 0;
        int ten = 0;

        for (int i = 0; i < bills.length; i++) 
        {
            if (bills[i] == 5) 
            {
                five++;
            } 
            else if (bills[i] == 10) 
            {
                if (five == 0) 
                {
                    return false;
                } 
                else 
                {
                    five--;
                    ten++;
                }
            } 
            else if (bills[i] == 20) 
            {
                if (five > 0 || ten > 0) 
                {                    
                    five--;
                    ten--;
                } 
                else if (five > 3) 
                {
                    five -= 3;
                } 
                else 
                {
                    return false;
                }
            }
        }
        return true;
        
    }

    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[] { 5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5 }));
        //5,5,5,10,5,5,10,20,20,20
        // 5,5,5,5,20,20,5,5,20,5
    }
}
