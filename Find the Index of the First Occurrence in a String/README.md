<h3>28. Find the Index of the First Occurrence in a String</h3>
<br>
Given two strings <code>needle</code> and <code>haystack</code>, return the index of the first occurrence of <code>needle</code> in <code>haystack</code>, or <code>-1</code> if <code>needle</code> is not part of <code>haystack</code>.<br>
<br>
<b>Example 1:</b><br>
<br>
<pre>
  <strong>Input:</strong> haystack = "sadbutsad", needle = "sad"
  <strong>Output:</strong> 0
  <strong>Explanation:</strong> "sad" occurs at index 0 and 6.<br>
  The first occurrence is at index 0, so we return 0.
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
  Input: haystack = "leetcode", needle = "leeto"
  Output: -1
  Explanation: "leeto" did not occur in "leetcode", so we return -1.
</pre>
<br>
<b>Constraints:</b><br>
<br>
<li><code>1 <= haystack.length, needle.length <= 10<sup>4</sup></code></li>
<li><code>haystack</code> and <code>needle</code> consist of only lowercase English characters.</li>
