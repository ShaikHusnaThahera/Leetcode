
import java.util.*;

class Solution {
    public int minInsertions(String s) {
        Stack<Character> st = new Stack<>();
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(ch);
            } else {
                // Check whether two consecutive ')' exist
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    ans++; // Insert the missing ')'
                }

                if (!st.isEmpty()) {
                    st.pop();
                } else {
                    ans++; // Insert the missing '('
                }
            }
        }

        // Each remaining '(' requires two ')'
        ans += st.size() * 2;

        return ans;
    }
}
