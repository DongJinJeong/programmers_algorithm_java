package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_12934 {
    public long solution(long n) {
        long answer = 0;
        double a = Math.sqrt(n);

        if (n % a == 0) {
            a += 1;
            answer = (long) (a * a);
        } else {
            answer = -1;
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(144, solution(121));
        Assert.assertEquals(-1, solution(3));
    }
}
