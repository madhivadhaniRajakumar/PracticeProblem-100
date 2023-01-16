
public class Program83 {

	 static void lowerTriangularMatrix(int matrix[][])
	    {
	        int row = matrix.length;
	        int col = matrix[0].length;
	        if (row != col) {
	            System.out.println(
	                "Matrix should be a Square Matrix");
	            return;
	        }
	        else {
	         
	            for (int i = 0; i < row; i++) {
	                for (int j = 0; j < col; j++) {
	 
	         
	                    if (i >j) {
	                        matrix[i][j] = 0;
	                    }
	                }
	            }
	 
	            System.out.println(
	                "Lower Triangular Matrix is given by :-");
	            // printing the lower triangular matrix
	            for (int i = 0; i < row; i++) {
	                for (int j = 0; j < col; j++) {
	                    System.out.print(matrix[i][j] + " ");
	                }
	                System.out.println();
	            }
	        }
	    }
	    public static void main(String[] args)
	    {
	        // driver code
	        int mat[][]
	            = { { 2, 1, 4 }, { 1, 2, 3 }, { 3, 6, 2 } };
	        // calling the function
	        lowerTriangularMatrix(mat);
	    }

}


