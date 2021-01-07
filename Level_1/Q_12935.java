package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Q_12935 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList arrayList = new ArrayList();

        for (int i : arr) {
            arrayList.add(i);
        }


        if (arrayList.size() == 1) {
            answer = new int[arrayList.size()];
            answer[0] = -1;
        } else {
            arrayList.remove(Collections.min(arrayList));
            answer = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                answer[i] = Integer.parseInt(String.valueOf(arrayList.get(i)));
            }
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertArrayEquals(new int[]{4, 3, 2}, solution(new int[]{4, 3, 2, 1}));
        Assert.assertArrayEquals(new int[]{-1}, solution(new int[]{10}));
    }
}
