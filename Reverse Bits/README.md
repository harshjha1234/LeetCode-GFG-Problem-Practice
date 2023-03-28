<h3>190. Reverse Bits</h3>
<br>
Reverse bits of a given 32 bits unsigned integer.<br>
<br>
<strong>Note:</strong><br>
<br>
<li>Note that in some languages, such as Java, there is no unsigned integer type. In this case, both input and output will be given as a signed integer type.<br>
They should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.<br></li>
<li>In Java, the compiler represents the signed integers using <strong>2's complement notation</strong>. Therefore, in <strong>Example 2</strong> above, the input represents the signed integer <code>-3</code> <br>
and the output represents the signed integer <code>-1073741825</code>.<br></li>
<br>
<b>Example 1:</b><br>
<br>
<pre>
  <strong>Input:</strong> n = 00000010100101000001111010011100
  <strong>Output:</strong>    964176192 (00111001011110000010100101000000)
  <strong>Explanation:</strong> The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, so return 964176192 
  which its binary representation is 00111001011110000010100101000000.
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
  <strong>Input:</strong> n = 11111111111111111111111111111101
  <strong>Output:</strong>   3221225471 (10111111111111111111111111111111)
  <strong>Explanation:</strong> The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293, so return 3221225471 
  which its binary representation is 10111111111111111111111111111111.
</pre>
<br>
<b>Constraints:</b><br>
<br>
<li>The input must be a binary string of length <code>32</code></li>
