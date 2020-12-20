package programmers;

import org.junit.Assert;
import org.junit.Test;

public class Q_42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n+1];

        for (int i = 1; i <= n; i++) {
            students[i] = 1;
        }
        for (int l : lost) {
            students[l]--;
        }
        for (int r : reserve) {
            students[r]++;
        }

        for (int i = 1; i <= n; i++) {
            if (students[i] == 0) {
                if (i-1 >= 1 && students[i - 1] == 2) {
                    students[i]++;
                    students[i - 1]--;
                } else if (i+1 <= n && students[i + 1] == 2) {
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }

        for (int s : students) {
            if (s >= 1) {
                answer++;
            }
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(5, solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        Assert.assertEquals(4, solution(5, new int[]{2, 4}, new int[]{3}));
        Assert.assertEquals(2, solution(3, new int[]{3}, new int[]{1}));
    }
}
