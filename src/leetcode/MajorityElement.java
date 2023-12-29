package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MajorityElement {
    public static void main(String[] args) {
        SolutionMajorityElement solutionMajorityElement = new SolutionMajorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

    }
}

class SolutionMajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        for (int el : nums) {
            if (Objects.isNull(elements.get(el))) {
                elements.put(el, 1);
            } else {
                elements.computeIfPresent(el, (k, v) -> v + 1);
            }
        }
        int result = nums[0];
        for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
            if (entry.getValue() > elements.get(result)) {
                result = entry.getKey();
            }
        }
        return result;
    }
}

