package programmers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Q_42748 {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answers = new ArrayList<>();

        for (int[] c : commands) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int k = c[0] - 1; k < c[1]; k++) {
                arr.add(array[k]);
            }
            Collections.sort(arr);
            answers.add(arr.get(c[2] - 1));
        }

        int[] answer = new int[answers.size()];
        for (int i = 0; i < answers.size(); i++) {
            answer[i] = answers.get(i);
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertArrayEquals(new int[]{5, 6, 3}, solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
    }
}
