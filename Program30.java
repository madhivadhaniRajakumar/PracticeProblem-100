import java.util.Scanner;

public class Program30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println(a + " is the largest number");
			}
			else {
				System.out.println(b + " is the largest number");
			}
			
		}
		else if(b>c) {
			System.out.println(b +" is the largest number");
		}
		else {
			System.out.println(c +" is the largest number");
		}

	}

}
