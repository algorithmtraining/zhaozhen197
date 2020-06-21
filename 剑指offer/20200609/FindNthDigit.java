public class FindNthDigit{
    public int findNthDigit(int n) {
        int digit = 1;
        int count =9;
        int start =1;
        while(n > count){
            n -= count;
            digit += 1;
            start *= 10;
            count = 9*digit*start;
        }
        
        long num = start + (n - 1) / digit; // 2.
        return Long.toString(num).charAt((n - 1) % digit) - '0';


    }
}