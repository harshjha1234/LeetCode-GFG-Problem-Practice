<h3>263. Ugly Number</h3>
<br>
An <strong>ugly number</strong> is a positive integer whose prime factors are limited to <code>2</code>, <code>3</code>, and <code>5</code>.<br>
<br>
Given an integer <code>n</code>, return <code>true<code> if <code>n</code> is an <strong>ugly number</strong>.<br>
<br>
<b>Example 1:</b><br>
<br>
<pre>
  <strong>Input:</strong> n = 6
  <strong>Output:</strong> true
  <strong>Explanation:</strong> 6 = 2 × 3
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
  <strong>Input:</strong> n = 1
  <strong>Output:</strong> true
  <strong>Explanation:</strong> 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
</pre>
<br>
<b>Example 3:</b><br>
<br>
<pre>
  <strong>Input:</strong> n = 14
  <strong>Output:</strong> false
  <strong>Explanation:</strong> 14 is not ugly since it includes the prime factor 7.
</pre>
<br>
<b>Constraints:</b><br>
<br>
<li><code>-2<sup>31</sup> <= n <= 2<sup>31</sup> - 1</code></li>
