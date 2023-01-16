
public class Program43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [] {2,4,5,6,7,8};
		int d=2;
		int temp;
		int len = a.length;
		for(int pos =0;pos<d;pos++) {
			temp = a[0];
			for(int i=1;i<len;i++) {
				a[i-1] = a[i];
			}
			a[len-1]=temp;
		}
		
	
	for(int i=0;i<len;i++) {
		System.out.print(a[i]);
	}
	}

}
