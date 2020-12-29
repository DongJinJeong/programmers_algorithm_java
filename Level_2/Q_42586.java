package programmers.Level_2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q_42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<Integer> day = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            for (int j = 1; ; j++) {
                if (100 - progresses[i] <= speeds[i] * j) {
                    day.add(j);
                    break;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < day.size(); i++) {
            if (queue.isEmpty()) {
                queue.offer(day.get(i));
                count++;
            } else if (queue.peek() >= day.get(i)) {
                queue.offer(day.get(i));
                count++;
            } else {
                arrList.add(count);
                queue.clear();
                count = 0;
                queue.offer(day.get(i));
                count++;
            }
        }
        arrList.add(count);

        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertArrayEquals(new int[]{2, 1}, solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}));
        Assert.assertArrayEquals(new int[]{1, 3, 2}, solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}));
    }
}
