public class MovingCount_zane {
    public int movingCount(int m, int n, int k) {

        boolean[][] visit = new boolean[m][n];

        return dfs(0, 0, m, n, k, visit);
    }

    public int dfs(int i, int j, int m, int n, int k, boolean[][] visit) {
        if (i >= m || j >= n || getSum(i) + getSum(j) > k || i < 0 || j < 0 || visit[i][j] == true) {
            return 0;
        }
        visit[i][j] = true;

        return 1 + dfs(i + 1, j, m, n, k, visit) + dfs(i - 1, j, m, n, k, visit) + dfs(i, j + 1, m, n, k, visit)
                + dfs(i, j - 1, m, n, k, visit);
    }

    // 获取数字的数位和
    public int getSum(int i) {
        int sum = 0;
        int tmp = i;
        while (tmp > 0) {
            sum += tmp % 10;
            tmp = tmp / 10;
        }

        return sum;
    }

    public int movingCount1(int m, int n, int k) {
        int cout = 0;
        int[][] knums = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                knums[i][j] = j + i;
                if (knums[i][j] <= k) {
                    cout++;
                }
            }
        }

        return cout;
    }

    public static void main(String[] args) {
        MovingCount_zane movingCount_zane = new MovingCount_zane();
        int count = movingCount_zane.movingCount1(3, 1, 0);
        System.out.println(count);
    }

}