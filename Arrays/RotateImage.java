//https://leetcode.com/problems/rotate-image/solution/

public class RotateImage {
    public static void main(String args[])
    {
        int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotate(matrix);
        display(matrix);
    }

    public static void rotate(int[][] matrix) {
        // First find the transpose that is rows to columns and columns to rows
        int temp = 0;
        for(int row = 0; row<matrix.length; row++)
        {
            for(int col = row; col<matrix[row].length; col++)
            {
                temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        // Then reverse each row to get the rotated matrix
        for(int row = 0; row<matrix.length; row++)
        {
            for(int col = 0; col<matrix[row].length/2; col++)
            {
                temp = matrix[row][col];
                matrix[row][col] = matrix[row][matrix[row].length-1-col];
                matrix[row][matrix[row].length-1-col] = temp;
            }
        }
    }



    public static void display(int[][] array)
    {
        for(int i[] : array)
        {
            for(int j : i)
            System.out.print(j + " ");
            System.out.println();
        }
    }
}
