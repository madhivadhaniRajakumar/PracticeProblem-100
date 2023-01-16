import java.util.Scanner;

public class Program33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if((ch>='A' && ch<='Z')|| ch>='a'&&ch<='z') {
			System.out.println("It is an Alphabet");
		}
		else {
			System.out.println("It is not an Alphabet");
		}
	}

}
