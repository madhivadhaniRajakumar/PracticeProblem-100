import java.util.Scanner;

public class Problem59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String s1 = sc.next();
			String s2 = sc.next();
			int len1 =s1.length();
			int len2=s2.length();
			int f=0;
			
			for(int i=0;i<len1;i++) {
				int j;
					for( j=0;j<len2;j++) {
						if(s1.charAt(i+j)!=s2.charAt(j)) {
							break;
						}
					}
				if(j==len2) {
					System.out.println(i);
					f=1;
					break;
				}
			}
			if(f==0) {
				System.out.println(-1);
			}
			
	}

}
