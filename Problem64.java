
public class Problem64 {
/* APPROACH 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = new int [] {3,4,7,1,2,9,0,-2,89};
		int n = a.length;
		int []b = new int [n] ;
		for(int i=0;i<n;i++) {
			b[i]=a[i];
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(b[i]);		}
		

	}
*/
	
	// APPROACH 2
	public static void main(String[] args) {
		int []a = new int [] {3,4,7,1,2,9,0,-2,89};
		int n = a.length;
		int []b = a.clone() ;
		
		for(int i=0;i<n;i++) {
			System.out.print(b[i]);		}
		

	}
	}
	

