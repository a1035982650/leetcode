package exercises;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _621 {
    public int leastInterval(char[] tasks, int n) {
        int[] counts = new int[26];
        for (char task : tasks) {
            counts[task-'A']++;
        }
        Arrays.sort(counts);

        int maxTimeTask = 1;
        for (int i =25; i>0;i--){
            if (counts[25]== counts[i-1]){
                maxTimeTask++;
            }
        }
        return Math.max(tasks.length, counts[25]*(n+1)-(n+1-maxTimeTask));
    }
    
    @Test
    public void test(){
        assertEquals( 8,leastInterval(new char[]{'A','A','A','B','B','B'},        2));
    }
}

/*
        给你一个用字符数组 tasks 表示的 CPU 需要执行的任务列表。其中每个字母表示一种不同种类的任务。任务可以以任意顺序执行，并且每个任务都可以在 1 个单位时间内执行完。在任何一个单位时间，CPU 可以完成一个任务，或者处于待命状态。

        然而，两个 相同种类 的任务之间必须有长度为整数 n 的冷却时间，因此至少有连续 n 个单位时间内 CPU 在执行不同的任务，或者在待命状态。

        你需要计算完成所有任务所需要的 最短时间 。

        思路:
        最后完成的一定是重复次数最多的任务之一，反过来想第一个完成的也是重复最多的,且每隔n个任务就应该开始一个重复最多的任务；
        所以,如果冷却时间大于等于任务种类,那么就要加待命,时间小于等于（冷却时间+1）* 重复次数，最后一个冷却循环不用加间隔，且只有重复次数最多的任务；
        如果冷却时间小于任务种类，那么重复次数最多的任务间隔就大于冷却时间，其他任务次数小于等于最多次数,直接往间隔里加就好了,无需待命,时间=任务数量.
*/
