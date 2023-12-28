package leetcode;

import java.util.Arrays;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 2, 3, 3};
//        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4};
        SolutionRemoveDuplicates2 solutionRemoveDuplicates2 = new SolutionRemoveDuplicates2();
        System.out.println(solutionRemoveDuplicates2.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}

class SolutionRemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int forCondition = 2;
        for (int i = 0; i < nums.length - forCondition; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                for (int j = i + 1; j < nums.length; ++j) {
                    nums[j - 1] = nums[j];
                }
                count++;
                i--;
                forCondition++;
            }
        }
        return nums.length - count;
    }
}