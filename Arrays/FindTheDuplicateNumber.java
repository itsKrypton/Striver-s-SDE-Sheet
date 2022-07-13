//https://leetcode.com/problems/find-the-duplicate-number/

/*
 * To do this problem with O(n) complexity, you need to detect the cycle using linked list cycle detection. Use hare and tortoise method and then when you
 * find the meeting point, take the tortoise back to the start and move them by one spaces. Where they meet again is your answer.
 */

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];

        do
        {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        }
        while(tortoise != hare);

        tortoise = nums[0];

        while(tortoise != hare)
        {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }


    // This solution uses Cyclic Sort and is faster but it modifies the array.
    /* public int findDuplicate(int[] nums)
    {
        int i = 0;
        while(i < nums.length)
        {
            if(nums[i] != i + 1)
            {
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct])
                {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }

                else
                return nums[i];
            }

            else
            i++;
        }
        return -1;
    } */
}
