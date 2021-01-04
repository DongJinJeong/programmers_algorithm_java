package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_12926 {
    public String solution(String s, int n) {
        // A = 65, Z = 90, a = 97, z = 122
        String answer = "";
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (c == ' ') {
                answer += c;
                continue;
            }
            if (Character.isUpperCase(c)) {
                int int_char = (int) c + n;
                if (91 <= int_char) {
                    int m = int_char - 91;
                    int_char = 65 + m;
                    char char_int = (char) int_char;
                    answer += char_int;
                } else {
                    char char_int = (char) int_char;
                    answer += char_int;
                }
            }
            if (Character.isLowerCase(c)) {
                int int_char = (int) c + n;
                if (123 <= int_char) {
                    int m = int_char - 123;
                    int_char = 97 + m;
                    char char_int = (char) int_char;
                    answer += char_int;
                } else {
                    char char_int = (char) int_char;
                    answer += char_int;
                }
            }
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals("BC", solution("AB", 1));
        Assert.assertEquals("a", solution("z", 1));
        Assert.assertEquals("e F d", solution("a B z", 4));
        Assert.assertEquals("ZzYy", solution("AaZz", 25));
    }
}
