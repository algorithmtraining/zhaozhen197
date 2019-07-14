package examation;

public class SelectionSort {
    public static void main(String[] args) {

        int[] A = {1, 3, 4, 2, 5};


    }

    public int[] selectionSrot(int[] A) {

        int length = A.length;

        int i, j;
        int min;
        for (i = 0; i < length; i++) {
            min = i;
            for (j = i + 1; j < length; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }
            swap(A, i, j);
        }
        return A;
    }

    /**
     * @param A
     * @param i
     * @param j
     */
    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
