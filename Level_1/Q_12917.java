package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Q_12917 {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray();

        ArrayList chUpper = new ArrayList();
        ArrayList chLower = new ArrayList();
        for (char c : ch) {
            if (Character.isUpperCase(c)) {
                chUpper.add(c);
            } else {
                chLower.add(c);
            }
        }
        Collections.sort(chUpper);
        Collections.reverse(chUpper);

        Collections.sort(chLower);
        Collections.reverse(chLower);

        chLower.addAll(chUpper);

        for (int i = 0; i < chLower.size(); i++) {
            answer += chLower.get(i);
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals("gfedcbZ", solution("Zbcdefg"));
    }
}
