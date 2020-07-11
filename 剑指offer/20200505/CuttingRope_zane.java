class Solution {
    public int cuttingRope(int n) {
        if (n <= 3) {
            return n-1;
        }

        int tmp = n / 3;
        int modRes = n % 3;
        if (modRes == 0) {
            return (int) Math.pow(3, tmp);
        }

        if(modRes == 1){
            int res0 =(int)Math.pow(3, tmp-1);
            return  4*res0;
        }

        if(modRes == 2){
            int res0 =(int)Math.pow(3, tmp);
            return  2*res0;
          
        }
        return 0;
    }
}