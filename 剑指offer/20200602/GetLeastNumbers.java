import java.util.Arrays;

public class GetLeastNumbers {
    /**
     * 利用冒泡排序的特性，进行K次冒泡排序。
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];
        int tmp;
        for(int i=0;i<k;i++ ){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]<arr[j-1]){
                     tmp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] =tmp;
                }
            }
            res[i]=arr[i];
        }
      
        return res;
    }

    public int[] getLeastNumbers1(int[] arr, int k) {
        if(arr.length==0 || k==0){
            return new int[0];
        }
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int pivot = partition(arr,low,high);
            if(pivot > k)  high = pivot - 1;
            if(pivot < k)  low = pivot + 1;
            if(pivot == k)  break;
        }
        return Arrays.copyOf(arr,k);
      
    }

    public int[] getLeastNumbers2(int[] arr, int k) {
        if(arr.length==0 || k==0){
            return new int[0];
        }
        return quickSearch(arr, 0, arr.length-1,k-1);
    }
    public int[] quickSearch(int[] arr,int left,int right,int k){
        int pivt = partition(arr, left, arr.length -1);
        if(pivt==k){
            return Arrays.copyOf(arr, pivt+1);
        }
        return pivt>k? quickSearch(arr, left, pivt-1, k):quickSearch(arr, pivt+1, right, k);
    }

    public int partition(int[] arr,int left,int right){
        int key = arr[left];
        while(left<right){
            while(left<right && arr[right] >= key){
                right--;
            }
            arr[left]=arr[right];
            while(left<right && arr[left] <= key){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left]  = key;
        return left;
    }

    public static void main(String[] args) {
        GetLeastNumbers getLeastNumbers = new GetLeastNumbers();
        int [] nums = {3,2,1};
       System.out.println( getLeastNumbers.getLeastNumbers(nums, 2).length);
    }
}