<h3>51. N-Queens</h3>
<br>
The <strong>n-queens</strong> puzzle is the problem of placing <code>n</code> queens on an <code>n x n</code> chessboard such that no two queens attack each other.<br>
<br>
Given an integer <code>n</code>, return all distinct solutions to the <strong>n-queens puzzle</strong>. You may return the answer in <strong>any order</strong>.<br>
<br>
Each solution contains a distinct board configuration of the n-queens' placement, where <code>'Q'</code> and <code>'.'</code> both indicate a queen and an empty space, respectively.<br>
<br>
<b>Example 1:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/231548894-3eab7a62-d3dd-4a10-897f-0b888e729649.png">
<br>
<pre>
  <strong>Input:</strong> n = 4
  <strong>Output:</strong> [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
  <strong>Explanation:</strong> There exist two distinct solutions to the 4-queens puzzle as shown above
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
  <strong>Input:</strong> n = 1
  <strong>Output:</strong> [["Q"]]
</pre>
<br>
<b>Constraints:</b><br>
<br>
<li><code>1 <= n <= 9</code></li>
