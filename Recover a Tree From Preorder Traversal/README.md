<h3>1028. Recover a Tree From Preorder Traversal</h3>
<br>
We run a preorder depth-first search (DFS) on the <code>root<code> of a binary tree.<br>
<br>
At each node in this traversal, we output <code>D</code> dashes (where <code>D</code> is the depth of this node), then we output the value of this node. <br> 
If the depth of a node is <code>D</code>, the depth of its immediate child is <code>D + 1</code>.  The depth of the <code>root</code> node is <code>0</code>.<br>
<br>
If a node has only one child, that child is guaranteed to be the left child.<br>
<br>
Given the output <code>traversal</code> of this traversal, recover the tree and return its <code>root</code>.<br>
<br>
<b>Example 1:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/230784667-81f23ae0-2450-47ce-9f36-7a9794c6a1e3.png">
<br>
<pre>
  <strong>Input:</strong> traversal = "1-2--3--4-5--6--7"
  <strong>Output:</strong> [1,2,5,3,4,6,7]
</pre>
<br>
<b>Example 2:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/230784711-8469584f-21f1-4c6b-a9e6-27b37490f684.png">
<br>
<pre>
  <strong>Input:</strong> traversal = "1-2--3---4-5--6---7"
  <strong>Output:</strong> [1,2,5,3,null,6,null,4,null,7]
</pre>
<br>
<b>Example 3:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/230784755-ddf445b0-b823-4f8a-95ae-2347e3a9c759.png">
<br>
<pre>
  <strong>Input:</strong> traversal = "1-401--349---90--88"
  <strong>Output:</strong> [1,401,null,349,88,90]
</pre> 
<br>
<b>Constraints:</b><br>
<br>
<li>The number of nodes in the original tree is in the range <code>[1, 1000]</code>.</li>
<li><code>1 <= Node.val <= 10<sup>9</sup></code></li>
