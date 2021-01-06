package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Q_12933 {
    public long solution(long n) {
        long answer = 0;
        char[] chars = String.valueOf(n).toCharArray();
        ArrayList arrayList = new ArrayList();

        for (char c : chars) {
            arrayList.add(c);
        }
        Collections.sort(arrayList);
        Collections.reverse(arrayList);

        String str = "";
        for (int i = 0; i < arrayList.size(); i++) {
            str += String.valueOf(arrayList.get(i));
        }

        answer = Long.parseLong(str);

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(873211, solution(118372));
    }
}
