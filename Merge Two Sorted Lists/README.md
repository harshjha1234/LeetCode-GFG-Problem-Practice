<h3>21. Merge Two Sorted Lists</h3>
<br>
You are given the heads of two sorted linked lists <code>list1</code> and <code>list2</code>.<br>
<br>
Merge the two lists in a one <strong>sorted</strong> list. The list should be made by splicing together the nodes of the first two lists.<br>
<br>
Return <i>the head of the merged linked list</i>.<br>
<br>
<b>Example 1:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/225088538-b927d67f-2d3b-4254-bf3a-6338d2ee989b.png">
<br>
<pre>
  <strong>Input:</strong> list1 = [1,2,4], list2 = [1,3,4]
  <strong>Output:</strong> [1,1,2,3,4,4]
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
  <strong>Input:</strong> list1 = [], list2 = []
  <strong>Output:</strong> []
</pre>
<br>
<b>Example 3:</b><br>
<br>
<pre>
  <strong>Input:</strong> list1 = [], list2 = [0]
  <strong>Output:</strong> [0]
</pre>
<br>
<b>Constraints:</b><br>
<br>
<li>The number of nodes in both lists is in the range <code>[0, 50]</code>.</li>
<li><code>-100 <= Node.val <= 100</code></li>
<li>Both <code>list1</code> and <code>list2</code> are sorted in non-decreasing order.</li>
