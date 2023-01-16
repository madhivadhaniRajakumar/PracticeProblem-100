import java.util.Scanner;

public class Program51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		char []a= new char[10];
		for(int i=0;i<len;i++) {
			a[i]= s.charAt(i);
		}
		for(int i=len-1;i>=0;i--) {
			System.out.print(a[i]);
		}

	}

}
