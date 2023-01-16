import java.util.Scanner;

public class Program45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in the array");
		int n = sc.nextInt();
		int []a = new int[n];
		int sum =0;
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		
		System.out.println("The sum of all numbers in the array is : "+sum);

	}

}
