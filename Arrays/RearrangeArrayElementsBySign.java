import java.lang.reflect.AnnotatedArrayType;

//https://leetcode.com/problems/rearrange-array-elements-by-sign/discuss/2428989/Java-or-Comments-or-Easy-or-O(N)-Time

public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        int[] answer = new int[nums.length];
        int index = 0;
        int posPointer = 0;
        int negPointer = 0;

        while(index != answer.length)
        {
            for(int i=posPointer; i<nums.length; i++)
            {
                if(nums[i] >= 0)
                {
                    posPointer = i;
                    break;
                }
            }

            for(int i=negPointer; i<nums.length; i++)
            {
                if(nums[i] < 0)
                {
                    negPointer = i;
                    break;
                }
            }

            answer[index] = nums[posPointer++];
            answer[index+1] = nums[negPointer++];
            index += 2;
        }

        return answer;
    }
}
