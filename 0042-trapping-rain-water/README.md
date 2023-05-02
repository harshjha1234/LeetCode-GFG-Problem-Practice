<h3>42. Trapping Rain Water</h3>
<br>
Given <code>n</code> non-negative integers representing an elevation map where the width of each bar is <code>1</code>, compute how much water it can trap after raining.<br>
<br>
<b>Example 1:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/235724790-ddfccd02-7364-4e86-9502-51a41800cd33.png">
<br>
<pre>
<strong>Input:</strong> height = [0,1,0,2,1,0,1,3,2,1,2,1]
<strong>Output:</strong> 6
<strong>Explanation:</strong> The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
<strong>Input:</strong> height = [4,2,0,3,2,5]
<strong>Output:</strong> 9
</pre>
<br>
<b>Constraints:</b><br>
<br>
<li><code>n == height.length</code></li>
<li><code>1 <= n <= 2 * 10<sup>4</sup></code></li>
<li><code>0 <= height[i] <= 10<sup>5</sup></code></li>
