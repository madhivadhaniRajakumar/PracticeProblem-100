import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		int mid = len/2+1;
		int val = 1;
		if(len%2 ==0) {
			System.out.println("Invalid input length");
		}
		else {
			
			for(int i=0;i<len/2;i++) {
				for(int j=0;j<i;j++) {
					System.out.print(" ");
				}
				System.out.print(s.charAt(i));
				for(int j=mid;j>0;j--) {
					System.out.print(" ");
				}
				System.out.print(s.charAt(i));
				mid = mid-2;
				System.out.println();
				
					
				}
			mid = len/2;
			for(int i=mid;i<len;i++) {
				for(int j=mid;j>0;j--) {
					System.out.print(" ");	
				}
				mid=mid-1;
				System.out.print(s.charAt(i));	
				if(i==len/2) {
					System.out.println();
					continue;
				}
				for(int j=0;j<val;j++) {
					System.out.print(" ");
				}
				val = val+2;
			
				System.out.print(s.charAt(i));
			
			System.out.println();
		}
			
		}
	}

}
