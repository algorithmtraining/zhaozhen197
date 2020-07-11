class MergeSort{
    public void merge(int[] list,int start,int middle,int end){
        int[] backup = new int[end - start -1];
        int k =0;
        int s= start;
        int t = middle+1;
        while(s<middle&&t<end){
            if(list[s]<list[t]){
                backup[k++] = list[s++];
            }else{
                backup[t++] = list[t++];
            }
        }

        while(s<middle){
            backup[k++] = list[s++];
        }
        while(t<end){
            backup[k++] = list[t++];
        }

        for(int i=0;i<backup.length;i++){
            list[i] = backup[i];
        }
    }

    public void mergeSort(int [] list,int low,int high){
        if(low<high){
            mergeSort(list, low, (low+high)/2);
            mergeSort(list, (low+high)/2 +1, high);
            merge(list, low, (low+high)/2, high);
        }
    }

}