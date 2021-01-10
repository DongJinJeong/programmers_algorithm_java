package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_12947 {
    public boolean solution(int x) {
        boolean answer = true;
        char[] chars = String.valueOf(x).toCharArray();
        int k = 0;

        for (char c : chars) {
            k += Integer.parseInt(String.valueOf(c));
        }

        if (x % k != 0) {
            answer = false;
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertTrue(solution(10));
        Assert.assertTrue(solution(12));
        Assert.assertFalse(solution(11));
        Assert.assertFalse(solution(13));
    }
}
