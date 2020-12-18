package programmers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_68644 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (!arr.contains(numbers[i] + numbers[j])) {
                    arr.add(numbers[i] + numbers[j]);
                }
            }
        }

        int[] answer = new int[arr.size()];
        int size = 0;
        for (int temp : arr) {
            answer[size++] = temp;
        }
        Arrays.sort(answer);

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertArrayEquals(new int[]{2, 3, 4, 5, 6, 7}, solution(new int[]{2, 1, 3, 4, 1}));
    }
}
