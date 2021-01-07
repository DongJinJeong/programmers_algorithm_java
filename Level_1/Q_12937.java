package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_12937 {
    public String solution(int num) {
        String answer = "";

        if (num % 2 == 0)
            answer = "Even";
        else
            answer = "Odd";

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals("Odd", solution(3));
        Assert.assertEquals("Even", solution(4));
    }
}
