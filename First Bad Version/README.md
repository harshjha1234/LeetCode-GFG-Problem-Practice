<h3>278. First Bad Version</h3>
<br>
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. <br>
Since each version is developed based on the previous version, all the versions after a bad version are also bad.<br>
<br>
Suppose you have <code>n</code> versions <code>[1, 2, ..., n]</code> and you want to find out the first bad one, which causes all the following ones to be bad.<br>
<br>
You are given an API <code>bool isBadVersion(version)</code> which returns whether version is bad. Implement a function to find the first bad version.<br> 
You should minimize the number of calls to the API.<br>
<br>
<b>Example 1:</b><br>
<br>
<pre>
  <strong>Input:</strong> n = 5, bad = 4
  <strong>Output:</strong> 4
  <strong>Explanation:</strong>
  call isBadVersion(3) -> false
  call isBadVersion(5) -> true
  call isBadVersion(4) -> true
  Then 4 is the first bad version.
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
  <strong>Input:</strong> n = 1, bad = 1
  <strong>Output:</strong> 1
</pre> 
<br>
<b>Constraints:</b><br>
<br>
<li><code>1 <= bad <= n <= 2<sup>31</sup> - 1</code></li>
