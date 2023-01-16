import java.util.Scanner;

public class Program48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int l=n;
		int k;
		int count=0;
		for(int i=n;i>0;i--) {
		
			for(int j=i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(  k=i;k<=n;k++) {
				System.out.print(k);		
			}
			//for(int j=l;j<n;j-- ) {
			//	System.out.print(j);
		//	}
			//count =count+1;
		for(int j=n-1;j>=l;j--) {
			System.out.print(j);
		}
	
			System.out.println();
			l=l-1;
		}

	}

	}

