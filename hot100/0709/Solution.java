import java.util.*;

public class Solution {
    Map<String, String> phone = new HashMap<String, String>() {
        {
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }
    };
    List<String> res = new ArrayList<>();

    public void backTack(String combation, String next_digitals) {
        if (next_digitals.length() == 0) {
            res.add(combation);
            return;

        } else {
            String digit = next_digitals.substring(0, 1);
            String letters = phone.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = phone.get(digit).substring(i, i + 1);
                backTack(combation + letter, next_digitals.substring(1));
            }

        }
    }

    public List<String> letterCombinations(String digits) {
        if(digits!=null || digits != ""){
            backTack("", digits);
        }
        return res;
    }

}