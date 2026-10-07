class Solution {

    Set<String> ans = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {

        int leftRemove = 0;
        int rightRemove = 0;

        // Find minimum number of removals
        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                leftRemove++;
            }
            else if (ch == ')') {

                if (leftRemove > 0) {
                    leftRemove--;
                }
                else {
                    rightRemove++;
                }
            }
        }

        solve(s, 0, leftRemove, rightRemove, 0, new StringBuilder());

        return new ArrayList<>(ans);
    }

    private void solve(String s, int index,
                       int leftRemove,
                       int rightRemove,
                       int balance,
                       StringBuilder sb) {

        // Reached end
        if (index == s.length()) {

            if (leftRemove == 0 &&
                rightRemove == 0 &&
                balance == 0) {

                ans.add(sb.toString());
            }

            return;
        }

        char ch = s.charAt(index);

        // OPTION 1: REMOVE
        if (ch == '(' && leftRemove > 0) {

            solve(s, index + 1,
                  leftRemove - 1,
                  rightRemove,
                  balance,
                  sb);
        }

        if (ch == ')' && rightRemove > 0) {

            solve(s, index + 1,
                  leftRemove,
                  rightRemove - 1,
                  balance,
                  sb);
        }

        // OPTION 2: KEEP
        sb.append(ch);

        if (ch == '(') {

            solve(s, index + 1,
                  leftRemove,
                  rightRemove,
                  balance + 1,
                  sb);

        }
        else if (ch == ')') {

            if (balance > 0) {

                solve(s, index + 1,
                      leftRemove,
                      rightRemove,
                      balance - 1,
                      sb);
            }

        }
        else {

            solve(s, index + 1,
                  leftRemove,
                  rightRemove,
                  balance,
                  sb);
        }

        // BACKTRACK
        sb.deleteCharAt(sb.length() - 1);
    }
}