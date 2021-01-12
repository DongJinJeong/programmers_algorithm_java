package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Q_17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};

        ArrayList list1 = new ArrayList();
        for (int a1 : arr1) {
            String s1 = "";
            for (int i = 0; i < n; i++) {
                if (a1 % 2 == 1) {
                    s1 += "1";
                    a1 = a1 / 2;
                } else {
                    s1 += "0";
                    a1 = a1 / 2;
                }
            }
            String reverse = new StringBuilder(s1).reverse().toString();
            list1.add(reverse);
        }

        ArrayList list2 = new ArrayList();
        for (int a2 : arr2) {
            String s2 = "";
            for (int i = 0; i < n; i++) {
                if (a2 % 2 == 1) {
                    s2 += "1";
                    a2 = a2 / 2;
                } else {
                    s2 += "0";
                    a2 = a2 / 2;
                }
            }
            String reverse = new StringBuilder(s2).reverse().toString();
            list2.add(reverse);
        }

        ArrayList<String> answer_list = new ArrayList();
        for (int i = 0; i < n; i++) {
            char[] c1 = String.valueOf(list1.get(i)).toCharArray();
            char[] c2 = String.valueOf(list2.get(i)).toCharArray();
            String str = "";
            for (int k = 0; k < n; k++) {
                int a = Integer.parseInt(String.valueOf(c1[k])) + Integer.parseInt(String.valueOf(c2[k]));
                if (a == 0) {
                    str += " ";
                } else {
                    str += "#";
                }
            }
            answer_list.add(str);
        }

        answer = answer_list.toArray(new String[answer_list.size()]);

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals(new String[]{"#####", "# # #", "### #", "#  ##", "#####"}, solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28}));
        Assert.assertEquals(new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "}, solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10}));
    }
}
