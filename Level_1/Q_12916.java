package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_12916 {
    boolean solution(String s) {
        boolean answer = true;
        char[] ch = s.toCharArray();
        int p = 0;
        int y = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'p' || ch[i] == 'P') {
                p++;
            } else if (ch[i] == 'y' || ch[i] == 'Y') {
                y++;
            }
        }

        if (p != y) {
            answer = false;
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertTrue(solution("pPoooyY"));
        Assert.assertFalse(solution("Pyy"));
    }
}
