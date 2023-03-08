<h3>575. Distribute Candies</h3><br>
Alice has <code>n</code> candies, where the <code>i<sup>th</sup></code> candy is of type <code>candyType[i]</code>. Alice noticed that she started to gain weight, so she visited a doctor.<br>
<br>
The doctor advised Alice to only eat <code>n / 2</code> of the candies she has (<code>n</code> is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.<br>
<br>
Given the integer array <code>candyType</code> of length <code>n</code>, return the <strong>maximum</strong> number of different types of candies she can eat if she only eats <code>n / 2</code> of them.<br>
<br>
<b>Example 1:</b><br>
<br>
<pre>
  <strong>Input:</strong> candyType = [1,1,2,2,3,3]
  <strong>Output:</strong> 3
  <strong>Explanation:</strong> Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
  <strong>Input:</strong> candyType = [1,1,2,3]
  <strong>Output:</strong> 2
  <strong>Explanation:</strong> Alice can only eat 4 / 2 = 2 candies. Whether she eats types [1,2], [1,3], or [2,3], she still can only eat 2 different types.
</pre>
<br>
<b>Example 3:</b><br>
<br>
<pre>
  <strong>Input:</strong> candyType = [6,6,6,6]
  <strong>Output:</strong> 1
  <strong>Explanation:</strong> Alice can only eat 4 / 2 = 2 candies. Even though she can eat 2 candies, she only has 1 type.
</pre> 
<br>
<b>Constraints:</b><br>
<br>
<li><code>n == candyType.length</li></code>
<li><code>2 <= n <= 10^4</li></code>
<li><code>n</code> is even.</li>
<li><code>-10^5 <= candyType[i] <= 10^5</li></code>
