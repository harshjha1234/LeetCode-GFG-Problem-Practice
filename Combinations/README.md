<h3>77. Combinations</h3>
<br>
Given two integers <code>n</code> and <code>k</code>, return all possible combinations of <code>k</code> numbers chosen from the range <code>[1, n]</code>.<br>
<br>
You may return the answer in <strong>any order</strong>.<br>
<br>
<b>Example 1:</b><br>
<br>
<pre>
  <strong>Input:</strong> n = 4, k = 2
  <strong>Output:</strong> [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
  <strong>Explanation:</strong> There are 4 choose 2 = 6 total combinations.
  Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
  <strong>Input:</strong> n = 1, k = 1
  <strong>Output:</strong> [[1]]
  <strong>Explanation:</strong> There is 1 choose 1 = 1 total combination.
</pre>
<br>
<b>Constraints:</b><br>
<br>
<li><code>1 <= n <= 20</code></li>
<li><code>1 <= k <= n</code></li>
