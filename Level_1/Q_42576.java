package programmers;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Q_42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        String temp = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;

        while(i < completion.length){
            if(!completion[i].equals(participant[i])){
                temp = participant[i];
                break;
            }else{
                i++;
            }
        }

        if(!temp.equals("")){
            answer = temp;
        } else {
            answer = participant[participant.length-1];
        }

        return answer;
    }

    @Test
    public void 정답 () {
        Assert.assertEquals("leo", solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        Assert.assertEquals("vinko", solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"marina", "josipa", "nikola", "filipa"}));
        Assert.assertEquals("mislav", solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }
}
