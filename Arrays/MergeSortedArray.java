import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /* PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<m;i++)
        {
            if(nums1[i] == 0 && i>=m)
            continue;

            pq.add(nums1[i]);
        }

        for(int i=0;i<n;i++)
        pq.add(nums2[i]);

        for(int i=0; i<nums1.length;i++)
        nums1[i] = pq.poll(); */

        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i] > nums2[0])
            {
                int temp = nums1[i];
                nums1[i] = nums2[0];
                nums2[0] = temp;
            }

            Arrays.sort(nums2);
        }
    }
}
