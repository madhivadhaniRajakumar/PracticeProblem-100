import java.text.DecimalFormat;
import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breath of rectangle");
		DecimalFormat df=new DecimalFormat("#.##");
		float l = sc.nextFloat();
		float b = sc.nextFloat();
		float area = l*b;
		System.out.println("Area of the rectangle :" + df.format(area));
	}

}
