import java.util.Scanner;

public class Program29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'
				||ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("The character is a vowel");
		}
		else {
			System.out.println("The character is a Consonant");
		}
			

	}

}
