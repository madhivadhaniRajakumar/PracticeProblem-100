import java.util.Scanner;

public class Program28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num%2==0 && num!=0) {
			System.out.println("The number is even");
		}
		else if(num%2!=0) {
			System.out.println("The number is odd");
		}
		else {
			System.out.println("The number is zero");
		}
	}

}
