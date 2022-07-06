//https://leetcode.com/problems/maximum-subarray/

// Kadane's Algorithm

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int local_max = 0;
        int global_max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(local_max < 0)
            local_max = nums[i];

            else
            local_max+=nums[i];

            global_max = Math.max(global_max, local_max);
        }
        return global_max;
    }
}
