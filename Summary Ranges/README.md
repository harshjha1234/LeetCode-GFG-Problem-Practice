<h3>228. Summary Ranges</h3>
<br>
You are given a <strong>sorted unique</strong> integer array <code>nums</code>.<br>
<br>
A range <code>[a,b]</code> is the set of all integers from <code>a</code> to <code>b</code> (inclusive).<br>
<br>
Return the <strong>smallest sorted</strong> list of ranges that <strong>cover all the numbers in the array exactly</strong>. That is, each element of <code>nums</code> is covered by exactly one of the ranges,<br> 
and there is no integer <code>x</code> such that <code>x</code> is in one of the ranges but not in <code>nums</code>.<br>
<br>
Each range <code>[a,b]</code> in the list should be output as:<br>
<br>
<li><code>"a->b"</code> if <code>a != b</code></li>
<li><code>"a"</code> if <code>a == b</code></li>
<br>
<b>Example 1:</b><br>
<br>
<pre>
<strong>Input:</strong> nums = [0,1,2,4,5,7]
<strong>Output:</strong> ["0->2","4->5","7"]
<strong>Explanation:</strong> The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
<strong>Input:</strong> nums = [0,2,3,4,6,8,9]
<strong>Output:</strong> ["0","2->4","6","8->9"]
<strong>Explanation:</strong> The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"
</pre>
<br>
<b>Constraints:</b><br>
<br>
<li><code>0 <= nums.length <= 20</code></li>
<li><code>-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1</code></li>
<li>All the values of <code>nums</code> are unique.</li>
<li><code>nums</code> is sorted in ascending order.</li>
