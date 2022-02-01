
public class CodeSignal4 {

	public static int adjacentElementsProduct(int[] inputArray) {
	    int num = inputArray[0]* inputArray[1];
	    for (int a = 1; a < inputArray.length - 1; a++)
	    {
	        if (inputArray[a]* inputArray[a+1] > num)
	        {
	            num = inputArray[a]* inputArray[a+1];
	        }
	    }
	    return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(adjacentElementsProduct(new int[] {3,6,-2,-5,7,3}));
	}

}
