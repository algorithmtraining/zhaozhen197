import java.util.HashMap;

public class TwoSum {
    /**
     * 使用hashmap，遍历数组将数组的元素作为key值,将数组的value值设为target-sum[i],
     * 然后再次遍历数组判断num和target-num在数组中是不是同时存在
     * 
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, target - num);
        }
        for (int num : nums) {
            Object o = map.get(target - num);
            if (o != null) {
                int tmp = (int) o;
                if (tmp == num) {
                    int[] res = new int[2];
                    res[0] = num;
                    res[1] = target - num;
                    return res;
                }
            }

        }
        return null;
    }

    /**
     * 由于题中说明数组是有序递增的，那么
     */
    public int[] twoSum1(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while(i<j){
            if(nums[i]+nums[j]>target ){
                j--;
            }
            if(nums[i]+nums[j]<target){
                i++;
            }

            if(nums[i]+nums[j]==target){
                int[] res = new int[2];
                    res[0] = nums[i];
                    res[1] = nums[j];
                    return res;
            }
        }
        return null;
    }

}