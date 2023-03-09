<h3>23. Merge k Sorted Lists</h3>
<br>
You are given an array of <code>k</code> linked-lists <code>lists</code>, each linked-list is sorted in ascending order.<br>
<br>
Merge all the linked-lists into one sorted linked-list and return it.<br>
<br>
<b>Example 1:</b><br>
<br>
<pre>
  <strong>Input:</strong> lists = [[1,4,5],[1,3,4],[2,6]]
  <strong>Output:</strong> [1,1,2,3,4,4,5,6]
  <strong>Explanation:</strong> The linked-lists are:
  [
    1->4->5,
    1->3->4,
    2->6
  ]
  merging them into one sorted list:
  1->1->2->3->4->4->5->6
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
  <strong>Input:</strong> lists = []
  <strong>Output:</strong> []
</pre>
<br>
<b>Example 3:</b><br>
<br>
<pre>
  <strong>Input:</strong> lists = [[]]
  <strong>Output:</strong> []
</pre>
<br>
<b>Constraints:</b><br>
<br>
<li><code>k == lists.length</code></li>
<li><code>0 <= k <= 10<sup>4</sup></code></li>
<li><code>0 <= lists[i].length <= 500</code></li>
<li><code>-10<sup>4</sup> <= lists[i][j] <= 10<sup>4</sup></code></li>
<li><code>lists[i]</code> is sorted in <strong>ascending order</strong>.</li>
<li>The sum of <code>lists[i].length</code> will not exceed <code>10<sup>4</sup>.</code></li>
