
public class Program92 {

	 public static void main(String[] args) {    
	        System.out.println(sort("madhivadhani"));
	    }

	    static String temp="";
	    static String answer ="";
	    public static String sort(String s)
	    {

	    	    if (s.length() < 2) {
	    	        return s;
	    	    }

	    	    int pos = 0;
	    	    char min = s.charAt(0);
	    	    for(int i = 1; i < s.length(); i++) {
	    	        char c = s.charAt(i);
	    	        if (c < min) {
	    	            min = c;
	    	            pos = i;
	    	        }
	    	    }

	    	    System.out.printf("%c | %s\n", min, s.substring(0, pos) + s.substring(pos + 1));

	    	    return min + sort(s.substring(0, pos) + s.substring(pos + 1));
	    	}

}
