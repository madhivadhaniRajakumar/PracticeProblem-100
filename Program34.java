import java.util.Scanner;

public class Program34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		
		int sum =0;
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		System.out.println("Sum of the Natural Numbers "+sum);
		
		int large =0;
		int q = sum;
		int rem=0;
		while(q>10) {
			
			rem = q%10;
			if(rem>large) {
				large=rem;
			}
			q= q/10;
		}
		if(rem>large) {
			System.out.println("Largest Digit in the sum :"+rem);
		}
		else {
			System.out.println("Largest Digit in the sum :"+large);
		}
		
	}

}
