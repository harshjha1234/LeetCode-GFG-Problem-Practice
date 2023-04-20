<h3>383. Ransom Note</h3>
<br>
Given two strings <code>ransomNote</code> and <code>magazine</code>, return <code>true</code> if <code>ransomNote</code> can be constructed by using the letters from <code>magazine</code> and <code>false</code> otherwise.<br>
<br>
Each letter in <code>magazine</code> can only be used once in <code>ransomNote</code>.<br>
<br>
<b>Example 1:</b><br>
<br>
<pre>
  <strong>Input:</strong> ransomNote = "a", magazine = "b"
  <strong>Output:</strong> false
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
  <strong>Input:</strong> ransomNote = "aa", magazine = "ab"
  <strong>Output:</strong> false
</pre>
<br>
<b>Example 3:</b><br>
<br>
<pre>
  <strong>Input:</strong> ransomNote = "aa", magazine = "aab"
  <strong>Output:</strong> true
</pre>
<br>
<b>Constraints:</b><br>
<br>
<li><code>1 <= ransomNote.length, magazine.length <= 10<sup>5</sup></code></li>
<li><code>ransomNote</code> and <code>magazine</code> consist of lowercase English letters.</li>
