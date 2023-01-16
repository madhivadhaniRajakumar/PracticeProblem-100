import java.text.DecimalFormat;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 DecimalFormat df=new DecimalFormat("#.##");
		System.out.println("Enter height of the cylinder");
		float h = sc.nextFloat();
		System.out.println("Enter radius of the cylinder");
		float r = sc.nextFloat();
		double area = ((2*3.14)*(h*r))+(2*3.14*r*r);
		System.out.println("Area of cylinder : "+ df.format(area));
	}

}
