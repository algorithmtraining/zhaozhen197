class Exchange {
    public int[] exchange(int[] nums) {
        int length = nums.length;
        int i = 0;
        int j = length - 1;

        while (i < j) {
            while (i < j && nums[i] % 2 == 1) {
                i++;
            }

            while (i < j && nums[j] % 2 == 0) {

                j--;
            }
            if (nums[i] % 2 == 0 && nums[j] % 2 == 1) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Exchange cExchange = new Exchange();
        int[] nums = { 1, 4, 3, 1, 5 };
        cExchange.exchange(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}