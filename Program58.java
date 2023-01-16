import java.util.Scanner;

public class Program58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=0;
		int l=2;
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("*");
			}
			
			for(int j=0;j<k;j++) {
				System.out.print("_");
			}
			for(int j=n-i;j>0;j--) {
				System.out.print("*");
				
			}
			
			System.out.println();
			k += 2;
		
		}
		k=n;
		for(int i=0;i<n-1;i++) {
			
			for(int j=0 ; j<l;j++) {
				System.out.print("*");
			}
			
			for(int j =0;j<k;j++) {
				System.out.print("_");
			}
			for(int j=0 ; j<l;j++) {
				System.out.print("*");
			}
			l++;
			System.out.println();
			k=k-2;
		}
		
		

	}

}
