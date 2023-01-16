import java.util.Scanner;

public class Program39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] a = {2,3,5,6,7,9};
		int len = a.length;
		int small =100;
		for(int i=0;i<len;i++) {
			if(a[i]<small) {
				small=a[i];
			}
		}
		System.out.println(small);
	}

}
