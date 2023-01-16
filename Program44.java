import java.util.Scanner;

public class Program44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter the number of element in the array");
		//int n = sc.nextInt();
		int []a = new int[] {2,3,2,1,7,7};
		//System.out.println("Enter the elements");
	
		//int count=0;
		for(int i=0;i<6;i++) {
			for(int j=i+1;j<6;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		
		}

	}

}
