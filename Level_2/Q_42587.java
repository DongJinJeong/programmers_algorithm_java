package programmers.Level_2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q_42587 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue(Collections.reverseOrder());

        for (int p : priorities) {
            priorityQueue.offer(p);
        }

        while (!priorityQueue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorityQueue.peek() == priorities[i]) {
                    priorityQueue.poll();
                    answer++;
                    if (location == i) {
                        priorityQueue.clear();
                        break;
                    }
                }
            }
        }
        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(1, solution(new int[]{2, 1, 3, 2}, 2));
        Assert.assertEquals(5, solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
