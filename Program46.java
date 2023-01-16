import java.util.Scanner;

public class Program46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  int [] a = new int[] {2,3,4,5,6};
	  
	  int temp;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number of rotation");
	  int d= sc.nextInt();
	  for(int pos=0;pos<d;pos++) {
		  temp = a[0];
		  for(int i=0;i<5;i++) {
			  if(i<4)
			  a[i]= a[i+1];
			  else{
				  a[i]=temp;
			  }
		  }
	  }
	 
	  for(int i=0;i<5;i++) {
		  System.out.print(a[i]);
	  }
	}

}
