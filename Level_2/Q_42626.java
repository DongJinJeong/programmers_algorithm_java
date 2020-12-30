package programmers.Level_2;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class Q_42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            priorityQueue.offer(scoville[i]);
        }

        while (priorityQueue.peek() < K) {
            int result = 0;

            result = priorityQueue.poll() + (priorityQueue.poll() * 2);
            priorityQueue.offer(result);
            answer++;
            if (priorityQueue.size() == 1 && priorityQueue.peek() < K) {
                answer = -1;
                return answer;
            }
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(2, solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
        Assert.assertEquals(-1, solution(new int[]{1, 2}, 7));
    }
}
