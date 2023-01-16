
public class Program79 {
	int MAX = 100;
	  
    static boolean isIdentity(int mat[][], int N)
    {
        for (int row = 0; row < N; row++)
        {
            for (int col = 0; col < N; col++)
            {
                if (row == col && mat[row][col] != 1)
                    return false;
                else if (row != col && mat[row][col] != 0)
                    return false;
            }
        }
        return true;
    }
      
    // Driver Code
    public static void main(String args[])
    {
        int N = 4;
        int mat[][] = {{1, 0, 0, 0},
                       {0, 1, 0, 0},
                       {0, 0, 2, 0},
                       {0, 0, 0, 1}};
         
        if (isIdentity(mat, N))
           System.out.println("Yes ");
        else
           System.out.println("No ");
    }
}
 
 


