import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println();
		//Printing Multiplication table
		System.out.println("Multiplication Table");
		for(int i=1;i<=10;i++) {
			int prod = i*n;
			System.out.print(i+ " "+ "* "+ n + " =  "+ prod);
			System.out.println();
		}
		
		System.out.println();
		//Printing Subtraction table;
		System.out.println("Subtraction table");
		
		for(int i=n;i>0;i--) {
			int sub = n-i;
			System.out.print(n+ " - "+ i + " =  "+ sub);
			System.out.println();
		}
	}

}
