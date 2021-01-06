package programmers.Level_1;

public class Q_12932 {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        char[] chars = str.toCharArray();
        int[] answer = new int[chars.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(String.valueOf(chars[chars.length - 1 - i]));
        }

        return answer;
    }
}
