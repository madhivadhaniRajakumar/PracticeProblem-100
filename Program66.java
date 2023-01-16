
public class Program66 {
/* Approach 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] arr = new int [] {1, 2, 3, 4, 5};   
	        int n = 3;              
	        for(int i = 0; i < n; i++){  
	            int j, first;  	           
	            first = arr[0];  	          
	            for(j = 0; j < arr.length-1; j++){                
	                arr[j] = arr[j+1];  
	            }  	         
	            arr[j] = first;  
	        }  	          
	        System.out.println();  
	        for(int i = 0; i< arr.length; i++){  
	            System.out.print(arr[i] + " ");  
	        }  
	}
	
	*/
	//Approach 2
	public static void main(String[] args) {
		 int [] arr = new int [] {1, 2, 3, 4, 5};  
		 int k =2;
		 reverse(arr,0,arr.length);
		 reverse(arr,0,k-1);
		 reverse(arr, k, arr.length);
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]);
		 }
		
	}
	static int[] reverse(int arr[], int start, int end)
	{
	    int temp;
	    int size = end - start;
	 
	    for (int i = 0; i < (size / 2); i++) {
	        temp = arr[ i + start];
	        arr[i + start] = arr[start
	                             + size - i - 1];
	        arr[start + size - i - 1] = temp;
	    }
	    return arr;
	}
}
