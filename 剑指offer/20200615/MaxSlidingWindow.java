import java.util.Deque;
import java.util.LinkedList;

class MaxSlidingWindow {
    /**
     * 有单调双端队列来维护一个单调的线性队列。 队列的头部元素就是最大的元素。
     * 
     * 空间复杂度O(n) 时间复杂度O(n)
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0 || nums.length < k) {

            return new int[0];
        }
        // 初始化参数
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {

            // 在队列不为空的情况下，如果队列尾部的元素要比当前的元素小，或等于当前的元素
            // 那么为了维持从大到小的原则，我必须让尾部元素弹出
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.removeLast();
            }

            deque.addLast(i);
            // 如果滑动窗口已经略过了队列中头部的元素，则将头部元素弹出

            if (deque.peekFirst() == i - k) {
                deque.removeFirst();
            }
            // 看看窗口有没有形成，只有形成了大小为 k 的窗口，我才能收集窗口内的最大值
            if (i >= (k - 1)) {
                res[index++] = nums[deque.peekFirst()];
            }

        }
        return res;
    }

    public int[] maxSlidingWindow1(int[] nums, int k) {
        if (nums == null || k <= 0 || nums.length < k) {
            return new int[0];
        }
        // 初始化参数
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        int index = 0;
        // 让队列形成窗口
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }

        res[index++] = deque.peekFirst();
        for (int i = k; i < nums.length; i++) {
            // 如果滑动窗口已经略过了队列中头部的元素，则将头部元素弹出
            if (deque.peekFirst() == nums[i - k]) {
                deque.removeFirst();
            }
            // 在队列不为空的情况下，如果队列尾部的元素要比当前的元素小，或等于当前的元素
            // 那么为了维持从大到小的原则，我必须让尾部元素弹出
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            res[index++] = deque.peekFirst();

        }
        return res;
    }

}