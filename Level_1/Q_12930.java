package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_12930 {
    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                answer += chars[i];
                index = 0;
            } else {
                if (index % 2 == 0) {
                    answer += String.valueOf(chars[i]).toUpperCase();
                    index++;
                } else {
                    answer += String.valueOf(chars[i]).toLowerCase();
                    index++;
                }
            }
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals("TrY HeLlO WoRlD", solution("try hello world"));
        Assert.assertEquals("  TrY HeLlO WoRlD", solution("  try hello world"));
        Assert.assertEquals("TrY HeLlO WoRlD ", solution("try hello world "));
    }
}
