import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program89 {
	public static String[] method(Set<String> string)
    {
        String[] string_array = new String[string.size()];
 
        int index = 0;
 
        for (String str : string) {
            string_array[index++] = str;
        }
 
        return string_array;
    }
 
    
    public static void main(String[] args)
    {
    	String str = "Geeks for Geeks";
 
        Set<String> string_set= new HashSet<>(Arrays.asList(str));
 
        System.out.println("String: " + str);
 
        String[] String_array = method(string_set);
 
        System.out.println("Array of String: "
                           + Arrays.toString(String_array));
    }
}
