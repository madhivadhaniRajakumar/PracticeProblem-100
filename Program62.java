
public class Program62 {
/*
 * APPROACH 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = new int[] {2,5,1,6,0,9,8};
		int len = a.length;
		int []odd= new int[len/2+1];
		int []even = new int[len/2+1];
		int j=0,k=0;
		for(int i=0;i<len;i++) {
			if(i%2==0) {
				
				even[j++]= a[i];
				
			}
			else {
				odd[k++]=a[i];
				
			}
		}
		for(int i=0;i<even.length;i++) {
			System.out.print(even[i]+" ");
		}
		System.out.println();
		for(int i=0;i<odd.length;i++) {
			System.out.print(odd[i]+" ");
		}
	}
*/
	//APPROACH 2
	public static void main(String[] args) {
		int []a = new int[] {2,5,1,6,0,9,8};
		int n = a.length;
		int odd=1;
		int even =0;
		while(odd<n ) {
				System.out.print(a[odd]+" ");
				odd=odd+2;
		}
		System.out.println();
	while(even<n ) {
		System.out.print(a[even]+" ");
		even=even+2;
}
	}
}
