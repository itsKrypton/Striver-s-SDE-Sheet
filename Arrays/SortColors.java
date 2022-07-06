// https://leetcode.com/problems/sort-colors/

public class SortColors {
    public void sortColors(int[] nums) {
        int noOfZeroes = 0, noOfOnes = 0, noOfTwos = 0;
        for(int i : nums)
        {
            if(i == 0)
            noOfZeroes++;

            else if(i == 1)
            noOfOnes++;

            else
            noOfTwos++;
        }
        
        int index = 0;
        while(noOfZeroes != 0)
        {
            nums[index] = 0;
            index++;
            noOfZeroes--;
        }

        while(noOfOnes != 0)
        {
            nums[index] = 1;
            index++;
            noOfOnes--;
        }

        while(noOfTwos != 0)
        {
            nums[index] = 2;
            index++;
            noOfTwos--;
        }
    }
}
