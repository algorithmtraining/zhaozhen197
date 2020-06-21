public class MinArray {
    public int minArray(int[] numbers) {
        int legth = numbers.length;
        int i=legth-1;
        while(i>0){
            if(numbers[i]<numbers[i-1]){
                return numbers[i];
            }
            i--;
        }
        
        return numbers[0];
    }
}