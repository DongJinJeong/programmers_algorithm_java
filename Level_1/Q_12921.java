package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Q_12921 {
    public int solution(int n) {
        int answer = 0;
        boolean[] arr = new boolean[n+1];
        ArrayList arrayList = new ArrayList();

        arr[0] = arr[1] = false;
        for (int i = 2; i <= n; i += 1) {
            arr[i] = true;
        }

        for (int i = 2; i * i <= n; i += 1) {
            for (int j = i * i; j <= n; j += i) {
                arr[j] = false;
            }
        }

        for(int i=0; i<=n; i+=1) {
            if(true == arr[i]) {
                arrayList.add(i);
            }
        }
        answer = arrayList.size();

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(4, solution(10));
        Assert.assertEquals(3, solution(5));
    }
}
