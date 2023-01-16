//APPROACH 1
/*public class Program61 {
	public static void main(String[] args) {
		int []a = new int[] {2,5,1,6,0,9,8};
		int temp;
		int first =0;
		int last = a.length-1;
		while(first<last) {
			temp = a[first];
			a[first] = a[last];
			a[last] = temp;
			first++;
			last--;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		
	}
}*/

   public class Program61 {
	public static void main(String[] args) {
		int []a = new int[] {2,5,1,6,0,9,8};
		int n= a.length;
		int []b = new int[n];
	//	int j=n-1;
		for(int i=0;i<n;i++) {
			b[i]=a[n-1-i];
		
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(b[i]);
		}
		
	}
}

 