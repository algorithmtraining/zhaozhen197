import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArray_zane {

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        FindShortestSubArray_zane findShortestSubArray = new FindShortestSubArray_zane();
        System.out.println(findShortestSubArray.findShortestSubArray(nums));

    }

    public int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> aMap = new HashMap<>();
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            if (aMap.containsKey(nums[i])) {
                temp = aMap.get(nums[i]);
                temp++;
            }
            aMap.put(nums[i], temp);
            temp = 1;
        }

        int max = aMap.get(nums[0]);
        int key = nums[0];
        for (Map.Entry<Integer, Integer> entry : aMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }

        for (Map.Entry<Integer, Integer> entry : aMap.entrySet()) {
            if (entry.getValue() != max) {
                aMap.put(entry.getKey(), Integer.MIN_VALUE);
            }
        }

        int min = Integer.MAX_VALUE;
        int templength;
        for (Map.Entry<Integer, Integer> entry : aMap.entrySet()) {
            if (entry.getValue() != Integer.MIN_VALUE) {
                templength = lengthOfSubarray(nums, entry.getKey());
                if (templength < min) {
                    min = templength;
                }
            }

        }


        return min;
    }


    public int lengthOfSubarray(int[] nums, int key) {

        int tempi = Integer.MIN_VALUE;
        int tempj = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == key) {
                tempi = i;
                break;
            }

        }

        for (int j = nums.length - 1; j >= 0; j--) {

            if (nums[j] == key) {
                tempj = j;
                break;
            }

        }
        return tempj - tempi + 1;
    }

}
