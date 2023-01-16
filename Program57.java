import java.util.Scanner;

public class Program57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		int k;
		for(int i=0;i<len;i++) {
			k= len-1-i;
			for(int j=0;j<len;j++) {
				if(j==i||j==k) {
					System.out.print(s.charAt(j));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
