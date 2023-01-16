import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the co-eff of x^2 :");
		int a= sc.nextInt();
		System.out.println("Enter the co-eff of x^ :");
		int b= sc.nextInt();
		System.out.println("Enter the co-eff of constant :");
		int c= sc.nextInt();
		double d;
		double root1;
		double root2;
		System.out.println("Entered Polynomial equation is :");
		System.out.println(a +"x^2 + "+b+"x + "+c+" = 0");
		
		 d = (b*b)-(4*a*c);
		if(d>0) {
			root1 = (-b +Math.sqrt(d) )/(2*a);
			root2 = (-b -Math.sqrt(d) )/(2*a);
			System.out.println("The Roots of the equation are");
			System.out.println("Root 1: "+root1);
			System.out.println("Root 2: "+root2);
		}
		else if(d<0) {
			System.out.println("The roots are imaginary");
		}
		else {
			root1 = -b/(2*a);
			System.out.println("Both the Roots are equal");
			System.out.println("Roots are "+ root1);
		}
	}

}
