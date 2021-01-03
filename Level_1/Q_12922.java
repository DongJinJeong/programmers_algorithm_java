package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_12922 {
    public String solution(int n) {
        String answer = "";
        String su = "수";
        String bak = "박";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += su;
            } else {
                answer += bak;
            }
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals("수박수", solution(3));
        Assert.assertEquals("수박수박", solution(4));
    }
}
