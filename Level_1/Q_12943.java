package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_12943 {
    public int solution(long num) {
        int answer = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
                answer++;
            } else {
                num = num * 3 + 1;
                answer++;
            }
            if (answer == 500) {
                if (num != 1) {
                    answer = -1;
                    break;
                }
            }
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(8, solution(6));
        Assert.assertEquals(4, solution(16));
        Assert.assertEquals(-1, solution(626331));
    }
}
