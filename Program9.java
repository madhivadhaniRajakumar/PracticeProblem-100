import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {2,4,5,6,7,9,10,13};
		int [] b = {2,3,4,5,6,7,8,9,11,15};
		int [] c = new int[20];
		int len1=a.length;
		int len2 = b.length;
		int[] res =merge(a,b,len1,len2);
		
		for(int i=0;i<len1+len2;i++) {
			for(int j=i+1;j<len1+len2;j++) {
				if(res[i]==res[j]) {
					res[j]=-1;
				}
			}
		}
		int j=0;
		for(int i=0;i<len1+len2;i++) {
			if(res[i]!= -1) {
				c[j++]=res[i];
			}
		}
		for(int i=0;i<len1+len2;i++) {
			if(c[i]!=0)
			System.out.print(c[i]+ " ");
			}
		}
	
	
	private static int [] merge(int[]a,int[]b,int len1,int len2) {
		int[] result = new int[len1+len2];
		int i=0;
		int j=0;
		int k=0;
		while(i<len1 && j<len2) {
			if(a[i]<b[j]) {
					result[k++]= a[i++];
		
			}
			else  {
				
					result[k++]= b[j++];
				}
		}
		while(i<len1) {
			result[k++]=a[i++];
		}
		while(j<len2){
			result[k++]= b[j++];
		}
		return result;
	
	}

}
