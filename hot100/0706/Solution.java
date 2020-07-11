import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import javax.management.Query;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n =s.length();
        int end = -1;
        int res = 0;
        for(int i=0;i<n;i++){
            if(i !=0){
                set.remove(s.charAt(i-1));
            }
            while(end + 1 < n && !set.contains(s.charAt(end+1))){
                set.add(s.charAt(end+1));
                end ++ ;
            }
            res = Math.max(res,end - i +1);
        }

        return res;

    }
    public int lengthOfLongestSubstring1(String s){
        Queue<Character> queue = new LinkedList<>();
        int res = 0;
        for(char c: s.toCharArray()){
            if(queue.contains(c)){
                queue.poll();
            }
            queue.add(c);
            res = Math.max(res, queue.size());
        }
        return res;
    }
}