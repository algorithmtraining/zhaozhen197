package examation;

public class QuickSort {

    public static void main(String[] args) {
        int[] A = {1, 4, 5, 6, 9, 2, 3};

        QuickSort quickSort = new QuickSort();

        quickSort.sort(A, 0, A.length - 1);

        for (int i : A) {
            System.out.println(i);
        }

    }


    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public int partion(int[] A, int left, int right) {


        int temp = A[left];
        while (left < right) {
            while (left < right && A[right] >= temp) {
                right--;
            }

            A[left] = A[right];
            while (left < right && A[left] <= temp) {
                left++;
            }
            A[right] = A[left];
        }

        A[left] = temp;
        return left;
    }

    public void sort(int[] A, int left, int right) {
        if (left < right) {
            int k = partion(A, left, right);
            sort(A, left, k - 1);
            sort(A, k + 1, right);
        }
    }
}
