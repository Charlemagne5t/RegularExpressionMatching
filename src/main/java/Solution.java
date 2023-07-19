public class Solution {
    public boolean isMatch(String s, String p) {
        return dfs(s, 0, p, 0);
    }

    public boolean dfs(String s, int i, String p, int j) {
        if (i >= s.length() && (j >= p.length() || (j == p.length() - 1 && p.charAt(j) == '*'))) {
            return true;
        }

        if (j >= p.length()) {
            return false;
        }

        if (j < p.length() - 1 && p.charAt(j + 1) == '*') {
            if ((i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'))) {
                return dfs(s, i, p, j + 2) || dfs(s, i + 1, p, j);
            } else {
                return dfs(s, i, p, j + 2);
            }
        } else {
            if (i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')) {
                return dfs(s, i + 1, p, j + 1);
            } else {
                return false;
            }
        }
    }
}
