import java.util.Scanner;

public class Program27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to swap");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int temp;
		System.out.println("After swap");
		temp=a;
		a=b;
		b=temp;
		System.out.println("a : "+ a);
		System.out.println("b : "+b);
	}

}
