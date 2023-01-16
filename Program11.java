
public class Program11 {
	static void rightRotate(int matrix[][],int n)  
	{  
	//determines the transpose of the matrix  
	for(int i=0;i<n;i++)  
	{  
	for(int j=i;j<n;j++)  
	{  
	int temp = matrix[i][j];  
	matrix[i][j] = matrix[j][i];  
	matrix[j][i] = temp;  
	}  
	}  
	  
	//then we reverse the elements of each row  
	for(int i=0;i<n;i++)  
	{  
	//logic to reverse each row i.e 1D Array.    
	int low = 0, high = n-1;  
	while(low < high)  
	{  
	int temp = matrix[i][low];  
	matrix[i][low] = matrix[i][high];  
	matrix[i][high] = temp;  
	low++;  
	high--;  
	}  
	}  
	  
	System.out.println("The Right Rotated Matrix is: ");  
	//prints matrix after rotation  
	for(int i=0;i<3;i++)  
	{  
	for(int j=0;j<3;j++)  
	{  
	System.out.print(matrix[i][j]+" " +"\t");  
	}  
	System.out.println();  
	}  
	}  
	//driver code  
	public static void main(String args[])  
	{  
	int n=3;  
	//initializing a 3*3 matrix  
	int matrix[][] = new int[][]{ {1,2,3}, {4,5,6} , {7,8,9} };  
	System.out.println("The Original Matrix is: ");  
	//prints matrix  
	for(int i=0;i<3;i++)  
	{  
	for(int j=0;j<3;j++)  
	{  
	//prints the elements of the matrix      
	System.out.print(matrix[i][j]+" " +"\t");  
	}  
	System.out.println();  
	}  
	//function calling  
	rightRotate(matrix, n);  
	}  

}
