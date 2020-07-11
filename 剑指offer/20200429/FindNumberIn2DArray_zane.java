import javax.lang.model.util.ElementScanner6;

public class FindNumberIn2DArray_zane {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (target == matrix[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1;
        while (row < rows && col >= 0){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
              row++;
            }else{
                col--;
                }
        }

            return false;
    }

    public static void main(String[] args) {
        FindNumberIn2DArray_zane solution = new FindNumberIn2DArray_zane();
        int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        System.out.println(solution.findNumberIn2DArray2(matrix, 2));

    }
}