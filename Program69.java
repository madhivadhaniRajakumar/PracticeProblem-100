
public class Program69 {
/* Approach 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[] {2,2,4,5,6,7,6,8};
		int k=2;
		int n= arr.length;
		for(int i=0;i<k;i++) {
			int  temp = arr[0];
			for(int j=1;j<n;j++) {
				
				arr[j-1]=arr[j];
				
			}
			arr[n-1-i]=temp;
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}
	*/
	//Approach 2
	public static void main(String[] args) {
		int []arr = new int[] {2,2,4,5,6,7,6,8};
		int k=2;
		int n = arr.length-1;
		reverse(arr,0,k-1);
		reverse(arr,k,n);
		reverse(arr,0,n);
		for(int i=0;i<=n;i++) {
			System.out.print(arr[i]);
		}
		
	}
	static int[] reverse(int[] c , int first,int last) {
		while(first<last) {
			int temp = c[first];
			c[first++]= c[last];
			c[last--]=temp;
		}
		return c;
	}

}
