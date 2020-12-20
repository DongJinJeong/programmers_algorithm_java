package programmers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Q_68935 {
    public int solution(int n) {
        int answer = 0;
        int b = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            b = n % 3;
            n = n / 3;
            arr.add(b);
            if (n == 0) {
                break;
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            int tmp = (int) (arr.get(i) * Math.pow(3, (arr.size() - i - 1)));
            answer += tmp;
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(7, solution(45));
        Assert.assertEquals(229, solution(125));
    }
}
