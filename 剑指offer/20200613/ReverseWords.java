public class ReverseWords {
    
    /**
     * 双指针
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        s= s.trim();
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count=0;
        int i = 0;
        int flag;
        while(i<s.length()){
            if(chars[i] == ' '){
                i++;
                continue;
            }
            flag = i;
            count=0;
            while(i<s.length() && chars[i++] != ' '){
                count++;
            }

            sb.insert(0, chars, flag, count);
            sb.insert(0, ' ');
        }
        
        return sb.toString().trim();
    }
    public String reverseWords1(String s) {
        StringBuilder sb = new StringBuilder()
        String[] strs = s.split(" ");
        for(int i=0;i<strs.length;i++){
            if(strs[i].equals("")){
                continue;
            }
            
            sb.insert(0, strs[i]).insert(0, ' ');
        }

        return sb.toString().trim();

    }

    public static void main(String[] args) {
        ReverseWords reverseWords =  new ReverseWords();
        String tmp = reverseWords.reverseWords("a good   example");
        System.out.println(tmp);
    }
}