package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Q_42889 {
    class Fail {
        int stage;
        double rate;

        Fail(int stage, double rate) {
            this.stage = stage;
            this.rate = rate;
        }
    }

    Comparator<Fail> comparator = new Comparator<Fail>() {
        @Override
        public int compare(Fail o1, Fail o2) {
            if (o1.rate < o2.rate) {
                return 1;
            } else if (o1.rate > o2.rate) {
                return -1;
            } else {
                if (o1.stage > o2.stage) {
                    return 1;
                } else if (o1.stage < o2.stage) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    };

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<Fail> fails = new ArrayList<Fail>();
        int total = stages.length;

        int[] users = new int[N + 1];
        for (int s : stages)
            users[s - 1]++;

        for (int i = 0; i < N; i++) {
            if (users[i] == 0) {
                fails.add(new Fail(i + 1, 0));
            } else {
                fails.add(new Fail(i + 1, (double) users[i] / total));
                total -= users[i];
            }
        }

        Collections.sort(fails, comparator);
        for (int i = 0; i < N; i++) {
            answer[i] = fails.get(i).stage;
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertArrayEquals(new int[]{3, 4, 2, 1, 5}, solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}));
        Assert.assertArrayEquals(new int[]{4, 1, 2, 3}, solution(4, new int[]{4, 4, 4, 4, 4}));
    }
}
