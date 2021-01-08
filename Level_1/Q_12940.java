package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Q_12940 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = Math.max(n, m);
        int b = Math.min(n, m);

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        answer[0] = a;
        answer[1] = a * (n / a) * (m / a);

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(new int[]{3, 12}, solution(3, 12));
        Assert.assertEquals(new int[]{1, 10}, solution(2, 5));
    }
}
