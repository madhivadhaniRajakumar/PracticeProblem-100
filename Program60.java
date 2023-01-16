import java.util.Scanner;

public class Program60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num;
		int sum =0;
		while(n>0) {
			num=0;
			for(int i=0;i<n;i++) {
				num = num*10 +1;
			}
			sum += num;
			n--;
		}
		System.out.println(sum);																																																																																																																										
	}

}
