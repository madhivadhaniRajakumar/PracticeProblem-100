import java.util.Scanner;

public class Program37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] a = {2,3,5,6,7,9};
		int len = a.length;
		for(int i=0;i<len;i++) {
			if(i%2!=0) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
