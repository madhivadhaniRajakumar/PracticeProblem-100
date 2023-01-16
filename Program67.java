import java.util.LinkedHashSet;

public class Program67 {
/* Approach 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[] {2,2,4,5,6,7,6,8};
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
				
		}
		
	}
	*/
	
	// Approach 2
	
	public static void main(String[] args) {
		int []arr = new int[] {2,2,4,5,6,7,6,8};
		removeDuplicates(arr);
		
	}
	 public static void removeDuplicates(int[] arr)
	    {
	        LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();       
	        for (int i = 0; i < arr.length; i++)
	            set.add(arr[i]);    
	        System.out.print(set);
	    }

}
