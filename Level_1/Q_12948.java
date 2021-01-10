package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_12948 {
    public String solution(String phone_number) {
        String answer = "";
        char[] chars = phone_number.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (i >= chars.length - 4) {
                answer += chars[i];
            } else {
                answer += "*";
            }
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals("*******4444", solution("01033334444"));
        Assert.assertEquals("*****8888", solution("027778888"));
    }
}
