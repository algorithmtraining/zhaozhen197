package examation;

public class InsertSort {


    public void insertSort(int[] A) {
        int n = A.length;
        for (int j = 1; j < n; j++) {
            int i = j - 1;
            int key = A[j];
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
        }
    }
}
