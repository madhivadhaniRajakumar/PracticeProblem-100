import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides of the square");
		float a = sc.nextFloat();
		float area = a*a;
		System.out.println("Area of the square :" + area);
		sc.close();
	}

}
