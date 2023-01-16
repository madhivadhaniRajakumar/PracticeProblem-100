import java.util.Scanner;

public class Program38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] a = {2,3,5,6,7,9};
		int len = a.length;
		int large =0;
		for(int i=0;i<len;i++) {
			if(a[i]>large) {
				large=a[i];
			}
		}
		System.out.println(large);
	}

}
