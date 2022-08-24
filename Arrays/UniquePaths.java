import java.util.Arrays;

//https://leetcode.com/problems/unique-paths/

public class UniquePaths
{
    public static void main(String args[])
    {
        System.out.println(uniquePaths(3, 2));
    }

    // Recursion method, time complexity is exponential.

    /* public int uniquePaths(int m, int n) {
        int[] target = {m-1, n-1};
        return findPaths(target, 0, 0);
    }
    
    public static int findPaths(int[] target, int currentX, int currentY)
    {
        if(currentX == target[0] && currentY == target[1])
        return 1;

        else if(currentX > target[0] || currentY > target[1])
        return 0;

        else 
        return findPaths(target, currentX, currentY + 1) + findPaths(target, currentX + 1, currentY);
    } */

    // We can improve the time complexity by using DP along with recursion. Time complexity now is quadratic.

    public static int uniquePaths(int m, int n) {
        int[] target = {m-1, n-1};
        int dp[][] = new int[m][n];
        for(int row[] : dp)
        Arrays.fill(row, -1);

        return findPaths(target, 0, 0, dp);
    }

    public static int findPaths(int[] target, int currentX, int currentY, int[][] dp)
    {
        if(currentX == target[0] && currentY == target[1])
        return 1;

        else if(currentX > target[0] || currentY > target[1])
        return 0;

        else if(dp[currentX][currentY] != -1)
        return dp[currentX][currentY];

        else 
        return dp[currentX][currentY] = findPaths(target, currentX, currentY + 1, dp) + findPaths(target, currentX + 1, currentY, dp);
    }
}