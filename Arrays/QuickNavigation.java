//https://leetcode.com/problems/majority-element/solution/

public class QuickNavigation {
    /*
     * We use Boyer-Moore algorithm in this. Make the first element the candidate and whenever you find the same element, increment the counter else decrement it.
     * Whenever count is 0 make the current element the new candidate and continue.
     * In the end our candidate will be the answer.
     */
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for(int num : nums)
        {
            if(count == 0)
            candidate = num;

            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
