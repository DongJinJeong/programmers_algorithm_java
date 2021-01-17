package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Q_12982 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int d_sum = 0;

        Arrays.sort(d);
        for (int i : d) {
            d_sum += i;
            if (d_sum > budget) {
                break;
            }
            answer++;
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(3, solution(new int[]{1, 3, 2, 5, 4}, 9));
        Assert.assertEquals(4, solution(new int[]{2, 2, 3, 3}, 10));
    }
}
