package leetcode;

import java.util.Arrays;
import java.util.Objects;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        int[] nums3 = new int[m];
        for (int i = 0; i < m; i++) {
            nums3[i] = nums1[i];
        }
        int a = 0, b = 0, c = 0;
        while (a < m && b < n) {
            if (nums3[a] < nums2[b]) {
                nums1[c++] = nums3[a++];
            } else {
                nums1[c++] = nums2[b++];
            }
        }
        while (a < m) {
            nums1[c++] = nums3[a++];
        }
        while (b < n) {
            nums1[c++] = nums2[b++];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
