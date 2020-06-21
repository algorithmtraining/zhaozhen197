package stack;

import java.util.Stack;

/**
 * 解题思路：因为有#得存在，需要将字符串中#得前面得字符删掉，所以需要先知道连续得#得个数有几个，然后再删除#号前面得字符，所以可以利用栈先进后出得特性
 *
 *
 * @date 2019-08-27
 * @author zane
 */
public class BackspaceCompare_zane_No844_0827 {

    public static void main(String[] args) {
        BackspaceCompare_zane_No844_0827 backspaceCompare_zane_no844_0827 = new BackspaceCompare_zane_No844_0827();
        String s = "bxj##tw";
        String t = "bxo#j##tw";

        System.out.println(backspaceCompare_zane_no844_0827.backspaceCompare(s, t));
    }


    public boolean backspaceCompare(String S, String T) {
        String str1 = getStringOfCancelBackspace(S);
        String str2 = getStringOfCancelBackspace(T);
        return str1.equals(str2);
    }

    public String getStringOfCancelBackspace(String s) {
        Stack<Character> characterStack1 = new Stack<>();
        Stack<Character> characterStack2 = new Stack<>();
        char temp;
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            characterStack1.push(chars[i]);
        }
        while (!characterStack1.isEmpty()) {
            temp = characterStack1.pop();
            if (temp == '#') {
                count++;
            }else {
                if (count != 0) {
                    for (int i = 0; i < count - 1; i++) {
                        if (characterStack1.isEmpty()) {
                            break;
                        }
                        temp = characterStack1.pop();
                        if (temp == '#') {
                            i--;
                            count++;
                        }
                    }
                }else {
                    characterStack2.push(temp);
                }
                count = 0;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!characterStack2.isEmpty()) {
            stringBuilder.append(characterStack2.pop());
        }

        return stringBuilder.toString();

    }
}
