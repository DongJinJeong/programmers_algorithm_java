package programmers.Level_2;

import org.junit.Assert;
import org.junit.Test;

public class Q_12899 {
    public String solution(int n) {
        String answer = "";
        String[] strings = {"4", "1", "2"};

        while (n > 0) {
            answer = strings[n % 3] + answer;
            if (n % 3 == 0) {
                n--;
            }
            n = n / 3;
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals("1", solution(1));
        Assert.assertEquals("2", solution(2));
        Assert.assertEquals("4", solution(3));
        Assert.assertEquals("11", solution(4));
    }
}
