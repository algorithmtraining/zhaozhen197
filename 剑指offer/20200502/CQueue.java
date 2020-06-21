import java.util.Stack;

class CQueue {
    Stack<Integer> tailStack = new Stack<>();
    Stack<Integer> headStack = new Stack<>();

    public CQueue() {

    }

    public void appendTail(int value) {
        tailStack.push(value);
    }

    public int deleteHead() {
        if (headStack.empty() && tailStack.empty()) {
            return -1;
        }
        if (headStack.empty() && !tailStack.empty()) {
            while (!tailStack.empty()) {
                headStack.push(tailStack.pop());
            }
        }
        return headStack.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such: CQueue obj = new
 * CQueue(); obj.appendTail(value); int param_2 = obj.deleteHead();
 */