import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findRepeatNumber(int[] nums) {
        HashMap<Integer, Integer> aMap = new HashMap<>();
        Integer tempInteger;
        for (int i = 0; i < nums.length; i++) {
            tempInteger = aMap.get(nums[i]);
            if (tempInteger != null) {
                aMap.put(nums[i], tempInteger + 1);
                return nums[i];
            } else {
                aMap.put(nums[i], 1);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 2, 3, 1, 0, 2, 5, 3 };
        System.out.println(solution.findRepeatNumber(nums));
    }
}