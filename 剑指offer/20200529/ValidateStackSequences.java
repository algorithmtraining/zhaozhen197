import java.util.Stack;

public class ValidateStackSequences{
    // 按照pushed 的顺序进行进站，然后按照poped的顺序进行出栈。如果最后栈内仍留存有数据，则返回false
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i=0; 
        int j=0;      
        while(i<pushed.length){
            stack.push(pushed[i++]);
            while(!stack.isEmpty()&&stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}

