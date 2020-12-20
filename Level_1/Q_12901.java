package programmers;

import org.junit.Assert;
import org.junit.Test;

public class Q_12901 {
    public String solution(int a, int b) {
        String answer = "";
        int sum = 0;
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        for (int i = 1; i < a; i++) {
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                sum += 30;
            } else if (i == 2) {
                sum += 29;
            } else {
                sum += 31;
            }
        }
        sum += b + 4;
        answer = week[sum % 7];

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals("TUE", solution(5,24));
    }
}
