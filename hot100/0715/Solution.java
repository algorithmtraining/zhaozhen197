class Solution {
    /**
     * 一定要注意要用long来存储，不然中间会溢出。
     * @param n
     * @return
     */
    public int waysToStep(int n) {
         long[] dp = new long[n+1];
         dp[1] = 1;
         if(n>=2){
             dp[2] = 2;
         }
         if(n>=3){
             dp[3]=4;
         }
         for(int i=4;i<=n;i++){
             dp[i]= dp[i-1] + dp[i-2] + dp[i-3];
             dp[i] = dp[i]%1000000007;
         }

        return (int)dp[n];
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        System.out.println(s.waysToStep(3));

    }
}