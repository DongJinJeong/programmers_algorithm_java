package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_12950 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int x = 0; x < arr1.length; x++) {
            for (int y = 0; y < arr2[0].length; y++) {
                answer[x][y] = arr1[x][y] + arr2[x][y];
            }
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertArrayEquals(new int[][]{{4, 6}, {7, 9}}, solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}}));
        Assert.assertArrayEquals(new int[][]{{4}, {6}}, solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}}));
    }
}
