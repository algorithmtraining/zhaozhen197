public class CountDigitOne {
    public int countDigitOne(int n) {
        int digit = 1;
        int hight = n / 10;
        int low = 0;
        int res = 0;
        int curr = n % 10;
        while (curr != 0 || hight != 0) {
            if (curr == 0) {
                res += hight * digit;
            } else if (curr == 1) {
                res += hight * digit + low + 1;
            } else {
                res += (hight + 1) * digit;
            }
            low += curr * digit;
            curr = hight % 10;
            hight = hight / 10;
            digit = 10 * digit;
        }
        return res;
    }

    public int countDigitOne1(int n) {
        return 0;
    }

    public int f(int n) {
        if (n <= 0) {
            return 0;
        }

        String s = String.valueOf(n);
        int high = s.charAt(0) - '0';
        int pow = (int) Math.pow(10, s.length() - 1);
        int last = n - high * pow;
        if (high == 1) {
            return f(pow - 1) + last + 1 + f(last);
        } else {
            return high * f(pow - 1) + pow + f(last);
        }
    }
}