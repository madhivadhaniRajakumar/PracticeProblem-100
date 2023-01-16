import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of outer circle");
		double rad1 = sc.nextDouble();
		System.out.println("Enter the radius of inner circle");
		double rad2 = sc.nextDouble();
		double area1,area2,areaspace;
		area1 = 3.14*rad1*rad1;
		area2 = 3.14*rad2*rad2;
		areaspace = area1-area2;
		System.out.println("The Area between the two concentric circle is "+ areaspace);

	}

}
