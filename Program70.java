import java.util.Arrays;

public class Program70 {
/* Approach 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[] {2,2,4,5,6,7,6,8};
		
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
		System.out.println(arr[1]);

	}
*/
	public static void main(String[] args) {
		int []arr = new int[] {2,2,4,5,6,7,6,8};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	
	}
}
