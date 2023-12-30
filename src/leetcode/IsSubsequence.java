package leetcode;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        IsSubsequenceSolution isSubsequenceSolution = new IsSubsequenceSolution();
        System.out.println(isSubsequenceSolution.isSubsequence(s, t));
    }
}
class IsSubsequenceSolution {
    public boolean isSubsequence(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        if (sChar.length == 0) {
            return true;
        }
        int index = 0;
        for (char el : tChar) {
            if (el == sChar[index]) {
                index++;
            }
            if (index == sChar.length) {
                return true;
            }
        }
        return false;
    }
}
