package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_12925 {
    public int solution(String s) {
        int answer = 0;
        
        answer = Integer.parseInt(s);

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(1234, solution("1234"));
        Assert.assertEquals(-1234, solution("-1234"));
    }
}
