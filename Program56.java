import java.util.Scanner;

public class Program56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n/2 ;
		int k = 1;
		int t=1;
		for(int i=space-1;i>0;i--) {
			
			for(int j=0;j<i-1;j++) {
				System.out.print(" ");
			}
			//System.out.println();
			for( int j=1;j<=t;j++) {
				System.out.print(k+ " ");
				k=k+1;
				if(k>n) {
					break;
				}
			}
			t=t+1;
			
			System.out.println();	
			
		}

	}

}
