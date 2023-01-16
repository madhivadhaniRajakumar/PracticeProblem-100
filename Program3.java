import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int rev = reverseNumber(num);
		int diff = num - rev;
		System.out.println(diff);
	}

	private static int reverseNumber(int n) {
		// TODO Auto-generated method stub
		int rev =0;
		while(n!=0) {
			
			int rem = n%10;
			
			 rev = rev * 10 + rem;
			 n = n/10;
		}
		return rev;
	}

}
