import java.util.Scanner;

public class Program41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] a = {2,3,5,6,7,9};
		int len = a.length;
		int [] b = new int[len];
		for(int i=0;i<len;i++) {
			b[i]=a[i];
		}
		for(int i=0;i<len;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
