import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstUniqChar{
    public char firstUniqChar(String s) {
        if(s.length()==0){
            return ' ';
        }
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        char tmp;
        for(int i=0;i<s.length();i++){
            tmp =s.charAt(i);
            if(map.get(tmp) ==null){
                map.put(tmp, 1);
            }else{
                map.put(tmp, map.get(tmp)+1);
            }
        }

        for(Iterator it = map.entrySet().iterator();it.hasNext();){  
            Entry<Character, Integer> entry = (Entry<Character, Integer>)it.next();  
            if(entry.getValue() ==1){
                return entry.getKey();
            }

        }
        return ' ';
    }
}