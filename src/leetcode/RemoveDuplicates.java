package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int []nums = {0,0,1,1,1,2,2,3,3,4};
        int before = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length ; i++) {
            if (before != nums[i]) {
                before = nums[i];
                nums[count] = before;
                count++;
            }
        }

    }

//        int[] nums = [...]; // Input array
//        int[] expectedNums = [...]; // The expected answer with correct length
//
//        int k = removeDuplicates(nums); // Calls your implementation
//
//        assert k == expectedNums.length;
//        for (int i = 0; i < k; i++) {
//            assert nums[i] == expectedNums[i];
//        }

}
