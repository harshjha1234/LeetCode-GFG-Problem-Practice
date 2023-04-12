class Solution {
    public char[][] board;
    public List<List<String>> answer; 
    public boolean[] rowHasQ;
    public boolean[] colHasQ;
    public boolean[] d1HasQ;
    public boolean[] d2HasQ;

    public void solve(int row, int col, int queensLeft) {
        if (queensLeft == 0) {
            List<String> validBoard = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                validBoard.add(new String(board[i]));
            }
            answer.add(validBoard);
            return;
        }
        if (row >= board.length)
            return;
        int d1 = col - row + (board.length - 1);
        int d2 = row + col;
        if (!rowHasQ[row] && !colHasQ[col] && !d1HasQ[d1] && !d2HasQ[d2]) {
            board[row][col] = 'Q';
            rowHasQ[row] = colHasQ[col] = d1HasQ[d1] = d2HasQ[d2] = true;
            solve(row + 1, 0, queensLeft - 1);
            board[row][col] = '.';
            rowHasQ[row] = colHasQ[col] = d1HasQ[d1] = d2HasQ[d2] = false;
        }
        if (col < board.length - 1) {
            solve(row, col + 1, queensLeft);
        }
    }

    public List<List<String>> solveNQueens(int n) {
        answer = new ArrayList<>();
        board = new char[n][n];
        for (int i = 0; i < board.length; i++)
            Arrays.fill(board[i], '.');
        rowHasQ = new boolean[n];
        colHasQ = new boolean[n];
        d1HasQ = new boolean[n * 2 - 1];
        d2HasQ = new boolean[n * 2 - 1];

        solve(0, 0, n);

        return answer;
    }
}
