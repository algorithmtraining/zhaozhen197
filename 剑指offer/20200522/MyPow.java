
public class MyPow {

    public double myPow2(double x, int n) {
        long b = n;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        double res = 1;
        for (long i = b; i > 0; i--) {
            res *= x;
        }
        return res;
    }

    public double myPow1(double x, int n) {
        long b = n;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }

        return fastPow(x, b);
    }

    public double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public double mypow3(double x, int n) {
        long b = n;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        double res = 1;
       
        for (long i = b; i > 0; i= i/2) {
            if (i % 2 == 1) {
                res = res * x;
            }
            x = x*x;
        }
        return res;

    }

    public static void main(String[] args) {
        MyPow m = new MyPow();
        System.out.println(m.myPow2(2, -2));
    }
}
