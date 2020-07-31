public class Solution {
            
    public String longestPalindrome(String s) {

        if(s == null || s.length() == 0)
        {
            return null;
        }
        int len = s.length();
        char[] arr = s.toCharArray();
        int max_len = 0;
        int start = 0;
        boolean dp[][]  = new boolean[len][len];
        for(int j =0;j<len;j++){
            dp[j][j] = true;
            for(int i=0;i<j;i++){
                if(arr[i] == arr[j]){
                    if(j-i<3){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = dp[i+1][j-1];
                    }
                }else{
                    dp[i][j] = false;
                }
                if(dp[i][j]){
                    int curLen = j -i +1;
                    if(curLen > max_len){
                        max_len = curLen;
                        start = i;
                    }
                }

                
            }
        }

        return s.substring(start, start + max_len);
    } 

}