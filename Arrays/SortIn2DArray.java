//https://leetcode.com/problems/search-a-2d-matrix/submissions/

public class SortIn2DArray
{    
    public static void main(String args[])
    {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int target = 7;

        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target)
    {
        int sRow = 0;
        int eRow = matrix.length - 1;

        while(sRow <= eRow)
        {
            int mid = sRow + (eRow - sRow) / 2;

            if(matrix[mid][0] <= target && matrix[mid][matrix[mid].length - 1] >= target)
            return binarySearch(matrix[mid], 0, matrix[mid].length-1, target);

            else if(matrix[mid][matrix[mid].length - 1] < target)
            sRow = mid + 1;

            else 
            eRow = mid - 1;
        }

        return false;
    }

    public static boolean binarySearch(int[] row, int start, int end, int target)
    {
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(row[mid] == target)
            return true;

            else if(row[mid] > target)
            end = mid - 1;

            else
            start = mid + 1;
        }

        return false;
    }
}
