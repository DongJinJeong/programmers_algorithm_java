package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_12916 {
    boolean solution(String s) {
        boolean answer = true;


        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertTrue(solution("pPoooyY"));
        Assert.assertFalse(solution("Pyy"));
    }
}
