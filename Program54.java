import java.util.Arrays;
import java.util.Scanner;

public class Program54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();

		}
		
	int i=2;
	while(i<n)
	{
		int tem;
		if(a[i-2]<a[i]) {
			tem = a[i-2];
			a[i-2]= a[i];
			a[i]=tem;
		}
		i +=2;
	}
	
	i=3;
	while(i<n)
	{
		int tem;
		if(a[i-2]>a[i]) {
			tem = a[i-2];
			a[i-2]= a[i];
			a[i]=tem;
		}
		i +=2;
	}
	
	for(int j=0;j<n;j++) {
		System.out.print(a[j]+" ");
	}
		
		
	}

}
