package programmers.Level_2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Q_42577 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length; i++) {
            String str = phone_book[i];
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[j].contains(str)) {
                    return !answer;
                }
            }
        }
        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertFalse(solution(new String[]{"119", "97674223", "1195524421"}));
        Assert.assertTrue(solution(new String[]{"123", "456", "789"}));
        Assert.assertFalse(solution(new String[]{"12", "123", "1235", "567", "88"}));
    }
}
