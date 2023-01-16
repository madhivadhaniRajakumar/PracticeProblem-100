import java.util.Scanner;

public class Program25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		System.out.println("Enter the diviser");
		int div = sc.nextInt();
		
		int q,rem;
		
		q=num/div;
		rem = num%div;
		System.out.println("The quatient of the given number is : "+q);
		System.out.println("The remainder of the given number is : "+rem);
 
	}

}
