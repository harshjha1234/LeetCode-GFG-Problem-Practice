<h3>11. Container With Most Water</h3>
<br>
You are given an integer array <code>height</code> of length <code>n</code>. There are <code>n</code> vertical lines drawn such that the two endpoints of the 
  <code>i<sup>th</sup></code> line are <code>(i, 0)</code> and <code>(i, height[i])</code>.<br>
<br>
Find two lines that together with the x-axis form a container, such that the container contains the most water.<br>
<br>
<i>Return the maximum amount of water a container can store.</i><br>
<br>
<strong>Notice</strong> that you may not slant the container.<br>
<br>
<b>Example 1:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/232245881-dfddb26a-6862-4216-bf1d-15ec2e84061b.png">
<br>
<pre>
  <strong>Input:</strong> height = [1,8,6,2,5,4,8,3,7]
  <strong>Output:</strong> 49
  <strong>Explanation:</strong> The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water 
  (blue section) the container can contain is 49.
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
  <strong>Input:</strong> height = [1,1]
  <strong>Output:</strong> 1
</pre> 
<br>
<b>Constraints:</b><br>
<br>
<li><code>n == height.length</code></li>
<li><code>2 <= n <= 10<sup>5</sup></code></li>
<li><code>0 <= height[i] <= 10<sup>4</sup></code></li>
