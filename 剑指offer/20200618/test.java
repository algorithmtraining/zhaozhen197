class Solution {
    public int strToInt(String str) {
        str = str.trim();
        if (str == null || str.length() == 0) {
            return 0;
        }
        int len = str.length();
        char[] arr = str.toCharArray();
        long res = 0;
        int begin = 0;
        int flag =0;
        if (arr[0] == '-') {
            flag = -1 ;
            begin = 1;
        } else if (arr[0] == '+') {
            flag = 1;
            begin = 1;
        }
        while (begin < len && arr[begin] >= '0' && arr[begin] <= '9') {
            res = res * 10 + arr[begin] - '0';
            if(res >= Integer.MAX_VALUE &&  flag == 1) return Integer.MAX_VALUE;
            if(res <= Integer.MAX_VALUE && flag == -1)  return Integer.MIN_VALUE;
            begin++;
        }

        return (int) res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.strToInt("-91283472332");
    }
}
