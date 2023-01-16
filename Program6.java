import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Students");
		int s = sc.nextInt();
		int roll = 101;
		int[] g1 = new int[20];
		int[] g2 = new int[20];
		int[] g3 = new int[20];
		int[] g4 = new int[20];
		int max = s/4;
		
		for(int i=0;i<max;i++) {
			g1[i] = roll++;
			g2[i] = roll++;
			g3[i] = roll++;
			g4[i] = roll++;
			
		}
		System.out.println("GROUP 1");
		for(int i=0;i<max;i++) {
			System.out.println(g1[i]);
		}
		
		System.out.println("GROUP 2");
		for(int i=0;i<max;i++) {
			System.out.println(g2[i]);
		}
		
		System.out.println("GROUP 3");
		for(int i=0;i<max;i++) {
			System.out.println(g3[i]);
		}
		
		System.out.println("GROUP 4");
		for(int i=0;i<max;i++) {
			System.out.println(g4[i]);
		}
		
		}
	}

