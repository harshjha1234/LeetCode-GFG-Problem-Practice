<h3>25. Valid Palindrome</h3>
<br>
A phrase is a <strong>palindrome</strong> if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,<br>
it reads the same forward and backward. Alphanumeric characters include letters and numbers.<br>
<br>
Given a string <code>s</code>, return <code>true</code> <i>if it is a <strong>palindrome</strong>, or <code>false</code> otherwise</i>.<br>
<br>
<b>Example 1:</b><br>
<br>
<pre>
  <strong>Input:</strong> s = "A man, a plan, a canal: Panama"
  <strong>Output:</strong> true
  <strong>Explanation:</strong> "amanaplanacanalpanama" is a palindrome.
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
  <strong>Input:</strong> s = "race a car"
  <strong>Output:</strong> false
  <strong>Explanation:</strong> "raceacar" is not a palindrome.
</pre>
<br>
<b>Example 3:</b><br>
<br>
<pre>
  <strong>Input:</strong> s = " "
  <strong>Output:</strong> true
  <strong>Explanation:</strong> s is an empty string "" after removing non-alphanumeric characters.
  Since an empty string reads the same forward and backward, it is a palindrome.
</pre>
<br>
<b>Constraints:</b><br>
<br>
<li><code>1 <= s.length <= 2 * 10<sup>5</sup></code></li>
<li><code>s</code> consists only of printable ASCII characters.</li>
