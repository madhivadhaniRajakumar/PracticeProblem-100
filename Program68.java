
public class Program68 {

	/*
	//Approach 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = new int[] {2,2,4,5,6,7,6,8};
		
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println(sum);

	}
	*/
	public static void main(String[] args) {
		int []arr = new int[] {2,2,4,5,6,7,6,8};
		int i=0,j=arr.length-1;
		int sum=0;
		while(i<j) {
			sum = sum+(arr[i++]+arr[j--]);
		}
		System.out.println(sum);
	}


}
