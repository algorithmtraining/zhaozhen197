public class HammingWeight {
    //先将十进制转为二进制，然后在二进制中查找1的个数。
    public int hammingWeight(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            sb.append(n >> i & 1);
        }

        int res = 0;
        for (int i = 0; i < 32; i++) {
            if (sb.charAt(i) == '1')
                res += 1;
        }

        return res;
    }

    public static void main(String[] args) {
        HammingWeight hWeight = new HammingWeight();
        hWeight.hammingWeight(2);
    }
}