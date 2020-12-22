package programmers;

import org.junit.Assert;
import org.junit.Test;

public class Q_12912 {
    public long solution(int a, int b) {
        long answer = 0;

        if (a <= b) {
            for (int i = a; i < b + 1; i++) {
                answer += i;
            }
        } else {
            for (int i = b; i < a + 1; i++) {
                answer += i;
            }
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(12, solution(3, 5));
        Assert.assertEquals(3, solution(3, 3));
        Assert.assertEquals(12, solution(5, 3));
    }
}
