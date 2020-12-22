package programmers;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Q_12915 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < strings.length; i++) {
            arrayList.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arrayList);

        answer = new String[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i).substring(1, arrayList.get(i).length());
        }

            return answer;
    }

    @Test
    public void 정답() {
        Assert.assertArrayEquals(new String[]{"car", "bed", "sun"}, solution(new String[]{"sun", "bed", "car"}, 1));
        Assert.assertArrayEquals(new String[]{"abcd", "abce", "cdx"}, solution(new String[]{"abce", "abcd", "cdx"}, 2));
    }
}