package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
//        Input: nums = [0,1,2,4,5,7]
//        Output: ["0->2","4->5","7"]
        int[] nums = {0, 1, 2, 4, 5, 7};
        SummaryRangesSolution solution = new SummaryRangesSolution();
        System.out.println(Arrays.toString(new List[]{solution.summaryRanges(nums)}));
    }
}

class SummaryRangesSolution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int indexBegin = 0;
        int indexLast = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] + 1) {
                indexLast = i + 1;
                break;
            }
            else {
                if (indexLast != 0) {
                    result.add(String.format("%d->%d", nums[indexBegin], nums[indexLast]));
                    indexLast = 0;
                    break;
                }
                    result.add(String.valueOf(nums[i]));
                    indexBegin = i + 1;
                    break;
            }



        }
        return result;
    }
}