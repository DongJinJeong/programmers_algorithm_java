package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_17682 {
    public int solution(String dartResult) {
        int answer = 0;
        char[] chars = dartResult.toCharArray();
        int[] score = new int[3];
        int num = -1;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                num++;
                if (chars[i] == '1' && chars[i + 1] == '0') {
                    score[num] = 10;
                    i++;
                } else {
                    score[num] = Integer.parseInt(String.valueOf(chars[i]));
                }
            } else if (chars[i] == 'D') {
                score[num] *= score[num];
            } else if (chars[i] == 'T') {
                score[num] *= score[num] * score[num];
            } else if (chars[i] == '*') {
                if (num > 0) {
                    score[num - 1] *= 2;
                }
                score[num] *= 2;
            } else if (chars[i] == '#') {
                score[num] *= -1;
            }
        }
        answer = score[0] + score[1] + score[2];

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(37, solution("1S2D*3T"));
        Assert.assertEquals(9, solution("1D2S#10S"));
        Assert.assertEquals(3, solution("1D2S0T"));
        Assert.assertEquals(23, solution("1S*2T*3S"));
        Assert.assertEquals(5, solution("1D#2S*3S"));
        Assert.assertEquals(-4, solution("1T2D3D#"));
        Assert.assertEquals(59, solution("1D2S3T*"));
    }
}
