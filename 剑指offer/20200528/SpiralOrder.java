import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public int[] SpiralOrder(int[][] matrix) {

        if(matrix.length ==0){
            return new int[0];
        }
        int top = 0, left = 0, right = matrix[0].length - 1, d = matrix.length - 1;
        int[] nums = new int[matrix.length * matrix[0].length];
        int count = 0;
        while (true) {
            // 从左导右
            for (int i = left; i <= right; i++) {
                nums[count++] = matrix[top][i];
            }
            // 如果上边界大于下边界跳出循环
            if (++top > d) {
                break;
            }

            // 从上到下
            for (int i = top; i <= d; i++) {
                nums[count++] = matrix[i][right];
            }
            // 如果右边界超过左边界，跳出循环
            if (--right < left) {
                break;
            }
            // 从右往左
            for (int i = right; i >= left; i--) {
                nums[count++] = matrix[d][i];
            }
            if (--d < top) {
                break;
            }

            // 从下往上
            for (int i = d; i >= top; i--) {
                nums[count++] = matrix[i][left];
            }

            if (++left > right) {
                break;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        SpiralOrder spiralOrder = new SpiralOrder();
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int [] nums = spiralOrder .SpiralOrder(matrix);
        System.out.println(nums.length);
    }
}