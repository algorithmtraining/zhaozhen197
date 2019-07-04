package array;

import static java.util.Arrays.sort;

public class ArrayPairSum_zane {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 8};
        System.out.println(arrayPairSum(nums));

    }

    /**
     * NO.561 将数组升序排序，偶数下标元素的和
     *
     * @param nums
     * @return
     */
    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        sort(nums);
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }
}
