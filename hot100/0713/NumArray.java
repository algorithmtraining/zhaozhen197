class NumArray {
    int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int i, int j) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int k =1;k<nums.length;k++){
            dp[k] = dp[k-1] + nums[k];
        }
        
        if(i==0){
            return dp[j];
        }

        return dp[j] -dp[i-1];
    }

    public int sumRange1(int i, int j) {
        int[] dp = new int[nums.length];
        for(int k =0;k<nums.length;k++){
            dp[k+1] = dp[k] + nums[k];
        }
        return dp[j+1] -dp[i];
    }
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0, 2));
    }
}