import java.util.HashMap;
import java.util.Map;

public class TwoSum_2_zane {

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println(towSum(numbers, target));

    }

    public static int[] towSum(int[] numbers, int target) {

        Map<Integer, Integer> numberMap = new HashMap();
        for (int i = 0; i < numbers.length; i++) {
            numberMap.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int num = target - numbers[i];
            if (numberMap.containsKey(num) && numberMap.get(num) != i) {
                return new int[]{i + 1, numberMap.get(num) + 1};
            }

        }


        return null;
    }

}
