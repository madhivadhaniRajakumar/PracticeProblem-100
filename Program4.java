import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");;
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//BIT AND
		System.out.println("BIT AND");
		System.out.println(a&b);
		
		System.out.println("BIT OR");
		System.out.println(a|b);
		
		System.out.println("BIT XOR");
		System.out.println(a^b);
		
		System.out.println("BIT COMPLIMENT");
		System.out.println(~a);
		
		System.out.println("BIT RIGHT SHIFT");
		System.out.println(a>>1);
		
		System.out.println("BIT LEFT SHIFT");
		System.out.println(a<<1);
		
		System.out.println("BIT UNSIGNED RIGHT SHIFT");
		System.out.println((a>>>1));
		
		
	}

}
