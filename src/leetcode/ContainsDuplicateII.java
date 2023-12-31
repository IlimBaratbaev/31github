package leetcode;


import java.util.HashMap;

public class ContainsDuplicateII {
    public static void main(String[] args) {
//        int[]nums = {1,2,3,1};
        int[]nums = {1,0,1,1};
        int k = 3;
        ContainsDuplicateIISolution solution = new ContainsDuplicateIISolution();
        System.out.println(solution.containsNearbyDuplicate(nums, k));
    }
}
class ContainsDuplicateIISolution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                boolean res =  Math.abs(map.get(nums[i]) - i) <= k;
                if (res) {
                    return res;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}