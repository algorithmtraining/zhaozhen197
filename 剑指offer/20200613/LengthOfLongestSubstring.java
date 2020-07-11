import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    /**
     * 滑动窗口。维护head,tail和一个hashmap.使用hash表来记录每个字符的索引，然后移动tail指针来拓展窗口，同时更新窗口的最大长度。如果tail指针当前指向的
     * 元素重复，就将head指针指向所重复元素的右侧。
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] strs = s.toCharArray();
        int len = s.length();
        int head=0,tail=0;
        int res = 0;

        while(tail<len){
            if(map.get(strs[tail]) != null){
                head = Math.max(map.get(strs[tail])+1,head);
            }
            map.put(strs[tail], tail);
            res = Math.max(res,tail-head+1);
            tail++;
        }
        return res;
    }
}