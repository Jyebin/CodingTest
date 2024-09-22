class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    boolean isSafe = true;
                    for (int a = i - 1; a <= i + 1; a++) {
                        for (int b = j - 1; b <= j + 1; b++) {
                            if (a < 0 || a >= board.length || b < 0 || b >= board[i].length) {
                                continue;
                            }
                            if (board[a][b] == 1) {
                                isSafe = false;
                                break;
                            }
                        }
                        if (!isSafe) {
                            break;
                        }
                    }

                    if (isSafe) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
