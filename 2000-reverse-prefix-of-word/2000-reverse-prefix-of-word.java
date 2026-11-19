
import java.util.*;

class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.length();
        Stack<Character> st = new Stack<>();
        StringBuilder r = new StringBuilder();
        int i=0;
        while (i<n) {
            st.push(word.charAt(i));
            if (word.charAt(i)==ch) {
                break;
            }
            i++;
        }
        if (i==n) {
            return word;
        }
        while (!st.isEmpty()) {
            r.append(st.pop());
        }
        r.append(word.substring(i + 1));
        return r.toString();
    }
}
