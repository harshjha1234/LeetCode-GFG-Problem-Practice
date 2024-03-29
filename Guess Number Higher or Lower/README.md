<h3>374. Guess Number Higher or Lower</h3><br>

We are playing the Guess Game. The game is as follows:<br>
<br>
I pick a number from <code>1</code> to <code>n</code>. You have to guess which number I picked.<br>
<br>
Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.<br>
<br>
You call a pre-defined API <code>int guess(int num)</code>, which returns three possible results:<br>
<br>
<li><code>-1</code>: Your guess is higher than the number I picked (i.e. <code>num > pick</code>).</li>
<li><code>1</code>: Your guess is lower than the number I picked (i.e. <code>num < pick</code>).</li>
<li><code>0</code>: your guess is equal to the number I picked (i.e. <code>num == pick</code>).</li>
<br>
Return the number that I picked.<br>
<br>
<b>Example 1:</b><br>
<br>
<pre>
  <strong>Input:</strong> n = 10, pick = 6
  <strong>Output:</strong> 6
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
  <strong>Input:</strong> n = 1, pick = 1
  <strong>Output:</strong> 1
</pre>
<br>
<b>Example 3:</b><br>
<br>
<pre>
  <strong>Input:</strong> n = 2, pick = 1
  <strong>Output:</strong> 1
</pre>
<br> 
<b>Constraints:</b><br>
<li><code>1 <= n <= 2^31 - 1</code></li>
<li><code>1 <= pick <= n</code></li>
