package programmers.Level_2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Q_49993 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] chars = skill.toCharArray();
        ArrayList<String> answer_list = new ArrayList();
        ArrayList<String> tree_list = new ArrayList();
        int c = chars.length;

        while (c != 0) {
            String str = "";
            for (int i = 0; i < c; i++) {
                str += String.valueOf(chars[i]);
            }
            answer_list.add(str);
            c--;
        }

        for (String s : skill_trees) {
            char[] tree = s.toCharArray();
            String str1 = "";
            for (char t : tree) {
                for (char ch : chars) {
                    if (t == ch) {
                        str1 += t;
                    }
                }
            }
            if (str1 == "") {
                str1 += chars[0];
            }
            tree_list.add(str1);
        }

        for (String s1 : answer_list) {
            for (String s2 : tree_list) {
                if (s1.equals(s2)) {
                    answer++;
                }
            }
        }

        System.out.println(tree_list);
        System.out.println(answer_list);

        if (answer == 0) {
            answer++;
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(3, solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA", "AA"}));
    }
}
