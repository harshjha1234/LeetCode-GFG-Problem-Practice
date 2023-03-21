<h3>112. Path Sum</h3>
<br>
Given the <code>root</code> of a binary tree and an integer <code>targetSum</code>, return <code>true</code> if the tree has a <strong>root-to-leaf</strong> path such that adding up all the values along the path equals <code>targetSum</code>.<br>
<br>
A <strong>leaf</strong> is a node with no children.<br>
<br>
<b>Example 1:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/226698266-dd564d54-c1c7-421c-9765-389167754ad3.png">
<br>
<pre>
  <strong>Input:</strong> root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
  <strong>Output:</strong> true
  <strong>Explanation:</strong> The root-to-leaf path with the target sum is shown.
</pre>
<br>
<b>Example 2:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/226698322-c5f60a0a-8fe1-4a4f-88ec-2b9d643bc672.png">
<br>
<pre>
  <strong>Input:</strong> root = [1,2,3], targetSum = 5
  <strong>Output:</strong> false
  <strong>Explanation:</strong> There two root-to-leaf paths in the tree:
  (1 --> 2): The sum is 3.
  (1 --> 3): The sum is 4.
  There is no root-to-leaf path with sum = 5.
</pre>
<br>
<b>Example 3:</b><br>
<br>
<pre>
  <strong>Input:</strong> root = [], targetSum = 0
  <strong>Output:</strong> false
  <strong>Explanation:</strong> Since the tree is empty, there are no root-to-leaf paths.
</pre>
<br>
<b>Constraints:</b><br>
<br>
  <li>The number of nodes in the tree is in the range <code>[0, 5000]</code>.</li>
  <li><code>-1000 <= Node.val <= 1000</code></li>
  <li><code>-1000 <= targetSum <= 1000</code></li>
