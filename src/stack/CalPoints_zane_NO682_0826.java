package stack;

import java.util.Stack;

public class CalPoints_zane_NO682_0826 {
    private Stack<String> stringStack;


    public CalPoints_zane_NO682_0826() {
        stringStack = new Stack<>();
    }


    public int calPoints(String[] ops) {
        for (String op : ops) {
            switch (op) {
                case "C":
                    stringStack.pop();
                    break;
                case "D":
                    doublee();
                    break;
                case "+":
                    sumIntegral();
                    break;
                default:
                    stringStack.push(op);
            }
        }

        return sum();

    }

    public void doublee() {
        String integral1 = stringStack.peek();
        stringStack.push(String.valueOf(Integer.valueOf(integral1) * 2));

    }

    public void sumIntegral() {

        String integral1 = stringStack.pop();
        String integral2 = stringStack.pop();
        stringStack.push(integral2);
        stringStack.push(integral1);
        stringStack.push(String.valueOf(Integer.valueOf(integral1) + Integer.valueOf(integral2)));
    }

    public int sum() {
        int sum = 0;
        int temp;
        while (!stringStack.isEmpty()) {
            temp = Integer.valueOf(stringStack.pop());
            sum += temp;
        }
        return sum;
    }



    public static void main(String[] args) {
        CalPoints_zane_NO682_0826 calPoints_zane_no682_0826 = new CalPoints_zane_NO682_0826();
        String[] ops = {
                "5","-2","4","C","D","9","+","+"
        };
        int val = calPoints_zane_no682_0826.calPoints(ops);
        System.out.println(val);

    }

}