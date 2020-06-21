public class Add{
    public int add(int a,int b){

        while(b !=0 ){
            int c = (a&b) << 1;
            a = a^b;
            b=c;
        }
        return a;
    }

    public int[] constructArr(int[] a) {
        int[] dh = new int[a.length];
        int[] dt = new int[a.length];
        int [] res = new int[a.length];
        dh[0] = 0;
        dt[a.length-1] = 0;
        int len = a.length;
        for(int i=1, j=len-2;i<len && j>= 0; i++,j --){
            if(dh[i-1] == 0){
                dh[i] = a[i-1];
            }else{
                dh[i] = dh[i-1] * a[i-1];
            }

            if(dt[j+1] == 0){
                dt[j] = a[j+1];
            }else{
                dt[j] = dt[j+1] * a[j+1];
            }
        }

        for(int i=0;i<a.length;i++){
            if(dh[i] == 0){
                res[i] = dt[i];
            }else if(dt[i] ==0){
                res[i] = dh[i];
            }else{
                res[i] = dh[i]*dt[i];

            }
        }

        return res;
    }

public static void main(String[] args) {
    Add add = new Add();

    System.out.println();
}
}