package programmers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Q_42840 {
    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = {0, 0, 0};

        for(int i = 0; i < answers.length; i++){
            if(answers[i] == person1[i%person1.length])
                score[0]++;
            if(answers[i] == person2[i%person2.length])
                score[1]++;
            if(answers[i] == person3[i% person3.length])
                score[2]++;
        }

        int max = 0;
        for(int i = 0; i < 3; i++){
            if(score[i] > max)
                max = score[i];
        }

        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            if(score[i] == max){
                tmp.add(i+1);
            }
        }

        int[] answer = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            answer[i] = tmp.get(i);
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertArrayEquals(new int[]{1}, solution(new int[]{1, 2, 3, 4, 5}));
        Assert.assertArrayEquals(new int[]{1, 2, 3}, solution(new int[]{1, 3, 2, 4, 2}));
    }
}