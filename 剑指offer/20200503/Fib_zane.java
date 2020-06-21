class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);

    }

    public int fib1(int n) {
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = (a+b)%1000000007;
            a=b;
            b=sum;
        }
        return a;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.fib(44));
    }
}