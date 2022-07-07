import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/merge-intervals/
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        ArrayList<Integer> startIndex = new ArrayList<>();
        ArrayList<Integer> endIndex = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        int currStart = intervals[0][0];
        int currEnd = intervals[0][1];
        for(int[] interval : intervals)
        {
            if(interval[0] <= currEnd)
            {
                if(interval[1] > currEnd)
                currEnd = interval[1];
            }

            else
            {
                endIndex.add(currEnd);
                startIndex.add(currStart);
                currStart = interval[0];
                currEnd = interval[1];
            }
        }
        startIndex.add(currStart);
        endIndex.add(currEnd);
        
        int answer[][] = new int[startIndex.size()][2];
        for(int i=0; i<startIndex.size(); i++)
        {
            answer[i][0] = startIndex.get(i);
            answer[i][1] = endIndex.get(i);
        }

        return answer;
    }   
}
