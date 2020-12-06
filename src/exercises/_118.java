package exercises;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class _118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(list);
        }
        return result;
    }

    @Test
    public void test() {
//        System.out.println(generate(1));
//        System.out.println(generate(2));
        System.out.println(generate(5));
    }
}
    /*

    给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。

    */