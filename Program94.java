import java.util.Arrays;

public class Program94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkInclusion("ab", "beooibai"));

	}
	public static boolean checkInclusion(String s1, String s2) {
	      int len1 = s1.length();
	      int len2 = s2.length();
	      if(len1>len2 || len2==0)
	      return false;

	      if(len1==0) 
	      return true;
	      int []frequency = new int[26];
	      int []window =new int[26];

	      for(int i=0;i<len1;i++){
	         frequency[s1.charAt(i)-'a']++;
	         window[s2.charAt(i)-'a']++;
	      }

	    for(int i=len1;i<len2;i++){
	        if(Arrays.equals(frequency,window)){
	            return true;
	        }
	        window[s2.charAt(i-len1)-'a']--;
	        window[s2.charAt(i)-'a']++;
	    }
	     if(Arrays.equals(frequency,window)){
	            return true;
	        }
	        else 
	        return false;

	    }

}
