import java.util.*;

public class TranslateNum{


    /**
     * 动态规划：初始条件 dp[0] =1; 转移方程dp[i] = dp[i-1] + dp[i-2]; 结果dp[length-1]
     */
    public int translateNum(int num) {

        String s =String.valueOf(num);
        // 初始化
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for(int i =1 ;i<s.length();i++ ){
            dp[i] = dp[i-1];
            int currentNum = 10 * (s.charAt(i-1)-'0') + (s.charAt(i)-'0');
            if(currentNum> 9 && currentNum<26){
                if(i-2<0){
                    dp[i]++;
                }else{
                    dp[i] += dp[i-2];
                }
            }
           
        }
        return dp[s.length() -1 ];
    }
}