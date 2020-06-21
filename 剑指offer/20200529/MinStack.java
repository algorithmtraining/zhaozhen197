import java.util.LinkedList;

class MinStack {

    LinkedList<Integer> stack;
    int min = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new LinkedList<>();
    }

    public void push(int x) {
        if (x < min) {
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        int p = stack.pop();
        if (p == min) {
            min = Integer.MAX_VALUE;
            LinkedList<Integer> tmp = stack;
            for (Integer num : tmp) {
                if (num < min) {
                    min = num;
                }
            }
        }

    }

    public int top() {
        return (int) stack.getFirst();
    }

    public int min() {
        return min;
    }
}
