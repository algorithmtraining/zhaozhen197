import java.util.Arrays;

public class IsStraight {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zeroCount =0;
        for (int num : nums) {
            if(num ==0){
                zeroCount++;
            }
        }
        int begin=zeroCount;
        int tmp;
        for(int i=begin;i<nums.length-1;i++)
        {
            tmp = nums[i+1]-nums[i];
            if(tmp==0 || (tmp != 1 && tmp-1>zeroCount--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsStraight isStraight = new IsStraight();
        int[] nums = {0,12,11,11,0};
       System.out.println(isStraight.isStraight(nums));
    }
}