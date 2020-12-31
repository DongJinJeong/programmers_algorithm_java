package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_12919 {
    public String solution(String[] seoul) {
        String answer = "";
        ArrayList arrayList = new ArrayList(Arrays.asList(seoul));

        int num = arrayList.indexOf("Kim");

        answer = "김서방은 " + num + "에 있다";

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals("김서방은 1에 있다", solution(new String[]{"Jane", "Kim"}));
    }
}
