class CuttingRopeII {
    /**
     * 该题与上一题的割绳子思路相同，但是其计算结果数据比较大，需要进行取模处理,不能使用math.pow函数，
     * 因为在计算过程中可能已经出现了大数越界现象，要用循环进行一步一步的乘法运算
     */
    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int tmp = n / 3;
        int moltmp = n % 3;
        int p = 1000000007;
        long x = 1;
        for (int i =0; i<tmp-1; i++) {
            x = x * 3;
            x = x % p;
        }

        if (moltmp == 0) {
            return (int) (x * 3 % p);
        }
        if (moltmp == 1) {
            return (int) (x * 4 % p);
        }
        if (moltmp == 2) {
            return (int) (x * 6 % p);
        }
        return 0;
    }
}