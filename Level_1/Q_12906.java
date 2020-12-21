package programmers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Q_12906 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]) {
                arrayList.add(arr[i]);
            }
        }

        arrayList.add(arr[arr.length-1]);

        int[] answer = new int[arrayList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertArrayEquals(new int[]{1, 3, 0, 1}, solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
        Assert.assertArrayEquals(new int[]{4, 3}, solution(new int[]{4, 4, 4, 3, 3}));
    }
}
