import java.util.Scanner;

public class Program35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		int fact;
		if(num==0) {
			fact=1;
		}
		else {
			fact=1;
		for(int i=num;i>0;i--) {
			fact *= i;
		}
		
	}
		System.out.println(fact);
	int q=fact;
	int sum=0,rem;
	if(fact<10) {
		sum=fact;
	}
	
	while(q>10) {
		q= q/10;
		rem = q%10;
		sum += rem;
	}
	System.out.println(sum);
	
	}
}
