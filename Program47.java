import java.util.Scanner;

public class Program47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int l =0;
		for(int i =1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=l;k>0;k--) {
				System.out.print(k);
			}
			l++;
			
			System.out.println();
		}

	}

}
