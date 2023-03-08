<h3>109.Convert Sorted List to Binary Search Tree</h3>
<br>
Given the <code>head</code> of a singly linked list where elements are sorted in <strong>ascending order</strong>, convert it to a height-balanced <i>binary search tree</i>.
</br>
<b>Example 1:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/223795057-94345b2a-2584-4c81-bdc2-8a7f277dbf29.png">
<br>
<pre>
  <strong>Input:</strong> head = [-10,-3,0,5,9]
  <strong>Output:</strong> [0,-3,9,-10,null,5]
  <strong>Explanation:</strong> One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
  <strong>Input:<strong> head = []
  <strong>Output:</strong> []
</pre>
<br> 
<b>Constraints:</b><br>
<br>
<li>The number of nodes in head is in the range <code>[0, 2 * 10<sup>4</sup>]</code>.</li>
<li><code>-10<sup>5</sup> <= Node.val <= 10<sup>5</sup></code></li>
