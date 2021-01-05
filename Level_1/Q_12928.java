package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_12928 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(28, solution(12));
        Assert.assertEquals(6, solution(5));
    }
}
