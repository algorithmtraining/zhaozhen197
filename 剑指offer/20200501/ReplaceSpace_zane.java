class Solution {
    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
    
        for (int i = 0; i < stringBuilder.length(); i++) {
            if(stringBuilder.charAt(i) == ' ')
            {
                stringBuilder.deleteCharAt(i);
                stringBuilder.insert(i, "%20");
            }
        }
        return stringBuilder.toString();
    }
}