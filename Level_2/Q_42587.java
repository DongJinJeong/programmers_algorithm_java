package programmers.Level_2;

import org.junit.Assert;
import org.junit.Test;

public class Q_42587 {
    public int solution(int[] priorities, int location) {
        int answer = 0;


        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(1, solution(new int[]{2, 1, 3, 2}, 2));
        Assert.assertEquals(5, solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
