package programmers.Level_1;

import org.junit.Assert;
import org.junit.Test;

public class Q_67256 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] left_hand = new int[]{3, 0};
        int[] right_hand = new int[]{3, 2};
        double left_x = 0.0;
        double left_y = 0.0;
        double left_result = 0.0;
        double right_x = 0.0;
        double right_y = 0.0;
        double right_result = 0.0;

        for (int i : numbers) {
            if (i == 1) {
                answer += "L";
                left_hand = new int[]{0, 0};
            } else if (i == 4) {
                answer += "L";
                left_hand = new int[]{1, 0};
            } else if (i == 7) {
                answer += "L";
                left_hand = new int[]{2, 0};
            } else if (i == 3) {
                answer += "R";
                right_hand = new int[]{0, 2};
            } else if (i == 6) {
                answer += "R";
                right_hand = new int[]{1, 2};
            } else if (i == 9) {
                answer += "R";
                right_hand = new int[]{2, 2};
            } else if (i == 2) {
                int[] mid_num = new int[]{0, 1};
                left_x = Math.abs((left_hand[0] - mid_num[0]));
                left_y = Math.abs((left_hand[1] - mid_num[1]));
                left_result = left_x + left_y;

                right_x = Math.abs((right_hand[0] - mid_num[0]));
                right_y = Math.abs((right_hand[1] - mid_num[1]));
                right_result = right_x + right_y;

                if (left_result > right_result) {
                    answer += "R";
                    right_hand = mid_num;
                } else if (left_result < right_result) {
                    answer += "L";
                    left_hand = mid_num;
                } else if (left_result == right_result) {
                    if (hand.equals("left")) {
                        answer += "L";
                        left_hand = mid_num;
                    } else {
                        answer += "R";
                        right_hand = mid_num;
                    }
                }
            } else if (i == 5) {
                int[] mid_num = new int[]{1, 1};
                left_x = Math.abs((left_hand[0] - mid_num[0]));
                left_y = Math.abs((left_hand[1] - mid_num[1]));
                left_result = left_x + left_y;

                right_x = Math.abs((right_hand[0] - mid_num[0]));
                right_y = Math.abs((right_hand[1] - mid_num[1]));
                right_result = right_x + right_y;

                if (left_result > right_result) {
                    answer += "R";
                    right_hand = mid_num;
                } else if (left_result < right_result) {
                    answer += "L";
                    left_hand = mid_num;
                } else if (left_result == right_result) {
                    if (hand.equals("left")) {
                        answer += "L";
                        left_hand = mid_num;
                    } else {
                        answer += "R";
                        right_hand = mid_num;
                    }
                }
            } else if (i == 8) {
                int[] mid_num = new int[]{2, 1};
                left_x = Math.abs((left_hand[0] - mid_num[0]));
                left_y = Math.abs((left_hand[1] - mid_num[1]));
                left_result = left_x + left_y;

                right_x = Math.abs((right_hand[0] - mid_num[0]));
                right_y = Math.abs((right_hand[1] - mid_num[1]));
                right_result = right_x + right_y;

                if (left_result > right_result) {
                    answer += "R";
                    right_hand = mid_num;
                } else if (left_result < right_result) {
                    answer += "L";
                    left_hand = mid_num;
                } else if (left_result == right_result) {
                    if (hand.equals("left")) {
                        answer += "L";
                        left_hand = mid_num;
                    } else {
                        answer += "R";
                        right_hand = mid_num;
                    }
                }
            } else if (i == 0) {
                int[] mid_num = new int[]{3, 1};
                left_x = Math.abs((left_hand[0] - mid_num[0]));
                left_y = Math.abs((left_hand[1] - mid_num[1]));
                left_result = left_x + left_y;

                right_x = Math.abs((right_hand[0] - mid_num[0]));
                right_y = Math.abs((right_hand[1] - mid_num[1]));
                right_result = right_x + right_y;

                if (left_result > right_result) {
                    answer += "R";
                    right_hand = mid_num;
                } else if (left_result < right_result) {
                    answer += "L";
                    left_hand = mid_num;
                } else if (left_result == right_result) {
                    if (hand.equals("left")) {
                        answer += "L";
                        left_hand = mid_num;
                    } else {
                        answer += "R";
                        right_hand = mid_num;
                    }
                }
            }
        }

        return answer;
    }

    @Test
    public void 정답() {
        Assert.assertEquals("LRLLLRLLRRL", solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
        Assert.assertEquals("LRLLRRLLLRR", solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
        Assert.assertEquals("LLRLLRLLRL", solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
    }
}
