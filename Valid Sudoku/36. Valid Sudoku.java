class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet <String> s = new HashSet <>();
        
        for (int i = 0; i < 9; i ++) {
            for (int j = 0; j < 9; j ++) {
                char ch = board[i][j];
                if(ch != '.') {
                    if(!s.add(ch + "row" + i)||!s.add(ch + "col" + j)||!s.add(ch + "grid" + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
