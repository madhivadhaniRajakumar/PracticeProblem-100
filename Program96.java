
public class Program96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String s = "hello";
				char c = 'u';
				int i=0;
				boolean present = false;
				while(i<s.length()) {
					if(c==s.charAt(i)) {
						present = true;
						break;
					}
					i++;
				}
				if(present) {
					System.out.println("Present");
				}
				else {
				System.out.println("Not present");
				}
		

	}

}
