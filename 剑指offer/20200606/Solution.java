public class Solution {
    public int search(int[] nums, int target) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] ==target){
                count++;
            }
        }
        return count;
    }

    public int search1(int[] nums, int target) {
        int count = 0;
        int i=0,j=nums.length-1;

        while(i<=j){
            int m =(i+j)/2;
            if(nums[m]  <target){
                i=m+1;
            }else{
                j=m-1;
            }
        }
        return i;
    }

    public int search2(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target - 1);
    }
    int helper(int[] nums, int tar) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] <= tar) i = m + 1;
            else j = m - 1;
        }
        return i;
    }


}