import java.util.HashSet;

public class TestDomeMergeNames {
	public static String[] uniqueNames(String[] names1, String[] names2) {

        HashSet<String> temp = new HashSet<String>();

        for (int i = 0; i < names1.length; i++)
        {
            if (!temp.contains(names1[i]))
            {
                temp.add(names1[i]);
            }
        }
        
        for (int j = 0; j < names2.length; j++)
        {
            if (!temp.contains(names2[j]))
            {
                temp.add(names2[j]);
            }
        }
        
        String[] result = new String[temp.size()];
        int a = 0;
        
        for (String s : temp)
        {
            if (s != "")
            {
                result[a] = s;
            }
            
            a++;
        }
        
        return result;
        
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", TestDomeMergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
		
	}

}
