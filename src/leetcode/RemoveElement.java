package leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        Solution solution = new Solution();
        solution.removeElement(nums, val);
        System.out.println(Arrays.toString(nums));
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int[] localNums = new int[nums.length];
        int index = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                localNums[index++] = nums[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            nums[i] = localNums[i];
        }
        return count;
    }
}