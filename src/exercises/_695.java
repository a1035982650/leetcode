package exercises;

/**
 * @author tianhu
 */
public class _695 {
    public static void main(String[] args) {
    }

    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        System.out.println(r+" "+c);
        int max = 0, island = 0;
        int dp[][] = new int[r + 1][c + 1];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                dp[i + 1][j + 1] = grid[i][j];
            }
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                if (dp[i + 1][j + 1] == 1) {
                    island += findOther(dp, i+1, j + 1);
                    max=max>=island?max:island;
                    island=0;
                }
            }
        return max;
    }

    private int findOther(int[][] dp, int i, int j) {
        if (i == 0 || j == 0||i==dp.length||j==dp[0].length)
            return 0;
        else if (dp[i][j] == 1)
            return 1 + findOther(dp, i + 1, j) + findOther(dp, i + 1, j) + findOther(dp, i - 1, j) + findOther(dp, i, j - 1);
        else
            return 0;
    }

}
