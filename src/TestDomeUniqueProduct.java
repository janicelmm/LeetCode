import java.util.HashMap;

public class TestDomeUniqueProduct {
	//return the first unique product, if none, return null
	public static String firstUniqueProduct(String[] products) {
		
		HashMap<String,Integer> uniqueProducts = new HashMap<String, Integer>();
		
		for (String s : products)
		{
			if(!uniqueProducts.containsKey(s))
			{
				uniqueProducts.put(s, 1);
			}
			else
			{
				uniqueProducts.put(s, uniqueProducts.get(s)+1);
			}
		}
		
		for (String a : products)
		{
			if (uniqueProducts.get(a) == 1)
			{
				return a;
			}
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqueProduct(new String[] {"a", "a", "a", "a"}));
	}

}
