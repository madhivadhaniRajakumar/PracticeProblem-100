import java.util.Scanner;

public class Program55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  
  for(int i=0;i<n;i++) {
	  if(i==0||i==n-1) {
		  int j=0;
		  while(j<n) {
			  System.out.print("*");
			  j++;
		  }
		  System.out.println();
	  }
	  else {
		  System.out.println("*");
	  }
  }
	}

}
