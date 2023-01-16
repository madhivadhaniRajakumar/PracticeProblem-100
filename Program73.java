
public class Program73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = new int [][] {{1,2,3},{2,3,4},{1,8,9}};
		int [][] b = new int [][] {{6,7,5},{4,5,1},{9,3,0}};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				sum = sum +a[i][j] + b[i][j];
			}
		}
		System.out.println(sum);

	}

}
