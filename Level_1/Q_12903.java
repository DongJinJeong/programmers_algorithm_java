package programmers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Q_12903 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");

        if (arr.length % 2 == 0) {
            answer = arr[arr.length / 2 - 1] + arr[arr.length / 2];
        } else {
            answer = arr[arr.length / 2];
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals("c", solution("abcde"));
        Assert.assertEquals("we", solution("qwer"));
    }
}
