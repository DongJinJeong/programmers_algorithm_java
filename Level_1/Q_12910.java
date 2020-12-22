package programmers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_12910 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arrayList.add(arr[i]);
            }
        }

        if (arrayList.isEmpty()) {
            return answer;
        } else {
            answer = new int[arrayList.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = arrayList.get(i);
            }
            Arrays.sort(answer);

            return answer;
        }
    }

    @Test
    public void 정답() {
        Assert.assertArrayEquals(new int[]{5, 10}, solution(new int[]{5, 9, 7, 10}, 5));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 36}, solution(new int[]{2, 36, 1, 3}, 1));
        Assert.assertArrayEquals(new int[]{-1}, solution(new int[]{3, 2, 6}, 10));
    }
}
