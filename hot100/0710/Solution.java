public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.isPalindrome(121);
    }

}