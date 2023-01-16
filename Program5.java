import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		int a = ch;
		for(int i= ch; i>=65; i-- ) {
			for(int j=0;j<i-64;j++) {
				System.out.print((char)i);
			}
			System.out.println();
		}
		
	}
	
}
