public class Pow {
    public static void main(String args[])
    {
        System.out.println(myPow(3, 2));
    }

    // Will give TLE as value of n could be very big
    /* public static double myPow(double x, int n) {
        double sum=x;
        if(n == 0)
        return 1;

        for(int i=1; i<Math.abs(n); i++)
        sum *= x;

        if(n > 0)
        return sum;

        else
        return 1/sum;
    } */

    //log(n) solution

    // Recursion method
    public static double myPow(double x, int n) 
    {
        if(n == 0)
        return 1;
        double res = helper(x,Math.abs(n));
        if(n > 0)
            return res;
        else
            return 1/res;
    }
    
    public static double helper(double x, int n) 
    {
        if(n == 0)
        return 1;
        double out =  helper(x, n/2);
        if(n % 2 == 0)
            return out * out;
        else
            return x * out * out;
    }

    // Bit manipulation method

    /* public static double myPow(double x, int n) 
    {
        if(n == 0)
        return 1;
        double res = helper(x,Math.abs(n));
        if(n > 0)
            return res;
        else
            return 1/res;
    }

    public static double helper(double x, int n)
    {
        double ans = 1;

        while(n > 0)
        {
            if((n & 1) == 1)
            ans *= x;

            x *= x;
            n = n >> 1;
        }

        return ans;
    } */
}
