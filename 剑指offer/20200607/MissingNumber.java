public class MissingNumber{

    /**
     * 一次遍历数组时间复杂度为O(N),空间复杂度是O(1),
     * 当数组中的元素值大于数组下标时返回该元素的下标。
     */
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int i;
        for( i=0;i<length;i++){
            if(nums[i]>i){
                return i;
            }
        }
        return i+1;
    }

    /**
     * 使用二分法来降低时间复杂度。
     * @param nums
     * @return
     */
    public int missingNumber1(int[] nums) {
        int i=0, j = nums.length-1;
        int mid;
        while(i<=j){
            mid = (i+j)/2;
            if(nums[mid] == mid){
                i=mid+1;
            }else{
                j= mid-1;
            }
        }
        return i;
    }
}