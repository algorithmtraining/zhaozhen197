public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length ==0){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] =nums[0];
        int max =dp[0];
        for(int i=1;i<nums.length;i++){
            if(dp[i-1]<=0){
                dp[i] = nums[i];
            }else{
                dp[i] = dp[i-1] + nums[i];
            }

            if(max<dp[i]){
                max = dp[i];
            }

        }
        
        return max;
    }
}