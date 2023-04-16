<h3>36. Valid Sudoku</h3>
<br>
Determine if a <code>9 x 9</code> Sudoku board is valid. Only the filled cells need to be validated <strong>according to the following rules:</strong><br>
<br>
Each row must contain the digits <code>1-9</code> without repetition.<br>
Each column must contain the digits <code>1-9</code> without repetition.<br>
Each of the nine <code>3 x 3</code> sub-boxes of the grid must contain the digits <code>1-9</code> without repetition.<br>
<br>
<strong>Note:</strong><br>
<br>
<li>A Sudoku board (partially filled) could be valid but is not necessarily solvable.</li>
<li>Only the filled cells need to be validated according to the mentioned rules.</li>
<br>
<b>Example 1:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/232332807-556bb2a3-eb6d-4ebf-aaa7-f31873e20e37.png">
<br>
<pre>
  <strong>Input:</strong> board = 
  [["5","3",".",".","7",".",".",".","."]
  ,["6",".",".","1","9","5",".",".","."]
  ,[".","9","8",".",".",".",".","6","."]
  ,["8",".",".",".","6",".",".",".","3"]
  ,["4",".",".","8",".","3",".",".","1"]
  ,["7",".",".",".","2",".",".",".","6"]
  ,[".","6",".",".",".",".","2","8","."]
  ,[".",".",".","4","1","9",".",".","5"]
  ,[".",".",".",".","8",".",".","7","9"]]
  <strong>Output:</strong> true
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
  <strong>Input:</strong> board = 
  [["8","3",".",".","7",".",".",".","."]
  ,["6",".",".","1","9","5",".",".","."]
  ,[".","9","8",".",".",".",".","6","."]
  ,["8",".",".",".","6",".",".",".","3"]
  ,["4",".",".","8",".","3",".",".","1"]
  ,["7",".",".",".","2",".",".",".","6"]
  ,[".","6",".",".",".",".","2","8","."]
  ,[".",".",".","4","1","9",".",".","5"]
  ,[".",".",".",".","8",".",".","7","9"]]
  <strong>Output:</strong> false
  <strong>Explanation:</strong> Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
</pre>
<br>
<b>Constraints:</b><br>
<br>
<li><code>board.length == 9</code></li>
<li><code>board[i].length == 9</code></li>
<li><code>board[i][j]</code> is a digit <code>1-9</code> or <code>'.'</code>.</li>
