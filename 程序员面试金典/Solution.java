
public class Solution{
    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        // HashMap<Character,Integer>  mapS1 = new HashMap<>();
        // for(int i =0;i<s1.length()-1;i++){
        //     if(mapS1.get(s1.charAt(i))!=null){
        //         mapS1.put(s1.charAt(i),mapS1.get(s1.charAt(i))+1);
        //     }
        //     mapS1.putIfAbsent(s1.charAt(i),1);
        // }

        int sum1=0;
        int sum2=0;
        for(int i=0;i<s1.length();i++){
            sum1 += s1.charAt(i);
            sum2+= s2.charAt(i);
        }
        return sum1 == sum2;
    }
}