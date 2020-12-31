package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_12918 {
    public boolean solution(String s) {
        boolean answer = true;
        char[] c = s.toCharArray();

        if (s.length() == 4 || s.length() == 6) {
            for (char ch : c) {
                if (String.valueOf(ch).matches("^[a-zA-Z]*$")) {
                    return !answer;
                }
            }
        } else {
            return !answer;
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertFalse(solution("34"));
        Assert.assertFalse(solution("a234"));
        Assert.assertTrue(solution("1234"));
    }
}
