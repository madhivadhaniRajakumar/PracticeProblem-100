import java.util.Scanner;

public class Program50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val=n;
		int k=0;
		while(k<n) {
			for(int i=0;i<k;i++) {
				System.out.print(" ");
				 
			}
			
			for(int i=k;i<n;i++) {
				System.out.print(val+" ");
			}
			k++;
			val--;
			System.out.println();
		}
	}

}
