<h3>10. Regular Expression Matching</h3>
<br>
Given an input string <code>s</code> and a pattern <code>p</code>, implement regular expression matching with support for <code>'.'</code> and <code>'*'</code> where:<br>
<br>
<li><code>'.'</code> Matches any single character.</li>
<li><code>'*'</code> Matches zero or more of the preceding element.</li>
<br>
The matching should cover the <strong>entire</strong> input string (not partial).<br>
<br>
<b>Example 1:</b><br>
<br>
<pre>
  <strong>Input:</strong> s = "aa", p = "a"
  <strong>Output:</strong> false
  <strong>Explanation:</strong> "a" does not match the entire string "aa".
</pre>
<b>Example 2:</b><br>
<br>
<pre>
  <strong>Input:</strong> s = "aa", p = "a*"
  <strong>Output:</strong> true
  <strong>Explanation:</strong> '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
</pre>
<br>
<b>Example 3:</b><br>
<br>
<pre>
  <strong>Input:</strong> s = "ab", p = ".*"
  <strong>Output:</strong> true
  <strong>Explanation:</strong> ".*" means "zero or more (*) of any character (.)".
</pre> 
<br>
<b>Constraints:</b><br>
<br>
<li><code>1 <= s.length <= 20</code></li>
<li><code>1 <= p.length <= 20</code></li>
<li><code>s</code> contains only lowercase English letters.</li>
<li><code>p</code> contains only lowercase English letters, <code>'.'</code>, and <code>'*'</code>.</li>
<li>It is guaranteed for each appearance of the character <code>'*'</code>, there will be a previous valid character to match.</li>
