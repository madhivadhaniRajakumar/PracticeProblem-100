import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char ch;
		System.out.println("Enter Character");
		ch = sc.next().charAt(0);
		
	    for(char c = ch; c <= 'Z'; c++)
	      System.out.print(c + " ");
	    }
	}


