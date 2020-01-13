package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BFSDFSGenerateParentheses {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<String>();
        if (n < 1) {
            return res;
        }
        helper(res, "", n, 0, 0);
        return res;
    }
    public void helper (ArrayList<String> res, String sb, int n, int left, int right) {
        if (left + right == 2 * n) {
            res.add(sb);
            return;
        }
        if (left < n) {
            helper(res, sb + "(", n, left + 1, right);
        }
        if (right < left) {
            helper(res, sb + ")", n, left, right + 1);
        }
    }
    /* or use StringBuilder involving classic backtracking
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<String>();
        if (n < 1) {
            return res;
        }
        helper(res, new StringBuilder(), n, 0, 0);
        return res;
    }
    public void helper (ArrayList<String> res, StringBuilder sb, int n, int left, int right) {
        if (left + right == 2 * n) {
            res.add(new String(sb));
            return;
        }
        if (left < n) {
            sb.append("(");
            helper(res, sb, n, left + 1, right);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (right < left) {
            sb.append(")");
            helper(res, sb, n, left, right + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    */
} 