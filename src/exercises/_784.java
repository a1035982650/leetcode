package exercises;

import java.util.*;

/**
 * @author tianhu
 */
public class _784 {
    public static void main(String[] args) {
        letterCasePermutation("a1b2");
    }

    static public List<String> letterCasePermutation(String s) {
        List<String > list = new ArrayList<>();
        add(list, s, 0);
        return list;
    }

    static  private void add(List<String> list, String s, int i) {
        if (i == s.length()) list.add(s);
        else {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                add(list, s.substring(0, i) + s.substring(i, i + 1).toUpperCase() + s.substring(i + 1, s.length()), i + 1);
                add(list, s.substring(0, i) + s.substring(i, i + 1).toLowerCase() + s.substring(i + 1, s.length()), i + 1);
            } else add(list, s, i + 1);
        }
    }
}
