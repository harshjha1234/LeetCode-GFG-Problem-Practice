class Solution {
    public int countBattleships(char[][] board) {
        if (board == null) {
            throw new IllegalArgumentException("Input is null");
        }
        if (board.length == 0 || board[0].length == 0) {
            return 0;
        }

        int r = board.length;
        int c = board[0].length;
        int cnt = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == 'X'
						&& (j == c - 1 || board[i][j + 1] == '.')
                        && (i == r - 1 || board[i + 1][j] == '.')) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}