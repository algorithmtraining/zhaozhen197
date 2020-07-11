public class SingleNumbers {
    public int[] singleNumbers(int[] nums) {

        int sum = 0;
        for (int num : nums) {
            sum ^= num;
        }

        int firstO = 1;
        while ((sum & firstO) == 0) {
            firstO <<= 1;
        }
        int a = 0;
        int b = 0;

        for (int num : nums) {
            if ((num & firstO) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }

        return new int[]{a,b};
    }
}