package programmers;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class Q_64061 {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> s = new Stack<Integer>();
        int answer = 0;

        for (int m : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][m-1] > 0) {
                    if (s.empty()) {
                        s.push(board[i][m - 1]);
                    } else {
                        if (s.peek() == board[i][m - 1]) {
                            s.pop();
                            answer += 2;
                        } else {
                            s.push(board[i][m - 1]);
                        }
                    }
                    board[i][m-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    @Test
    public void 정답(){
        Assert.assertEquals(4, solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4}));
    }
}
