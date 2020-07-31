import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Integer tmp = 0;
        ArrayList<Integer> list = new  ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            tmp =  map.get(nums1[i]);
            if( tmp != null){
                map.put(nums1[i], tmp+1);
            }else{
                map.put(nums1[i], 1);
            }
        }

        for(int i=0;i<nums2.length;i++){
            tmp = map.get(nums2[i]);
            if(tmp == null){
                continue;
            }else{
                list.add(nums2[i]);
                if(tmp > 1){
                    map.put(nums2[i], tmp-1);
                }else{
                    map.remove(nums2[i]);
                }
            }

        }
        int[] nums = list.stream().mapToInt(Integer::valueOf).toArray();
        return nums;
        
    }
}