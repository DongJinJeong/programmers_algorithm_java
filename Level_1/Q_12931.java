package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_12931 {
    public int solution(int n) {
        int answer = 0;
        char[] chars = String.valueOf(n).toCharArray();

        for (char c : chars) {
            answer += Integer.parseInt(String.valueOf(c));
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(6, solution(123));
        Assert.assertEquals(24, solution(987));
    }
}
