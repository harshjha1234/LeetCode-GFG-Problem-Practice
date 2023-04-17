<h3>39. Combination Sum</h3>
<br>
Given an array of <strong>distinct</strong> integers <code>candidates</code> and a target integer <code>target</code>, return a list of all <strong>unique combinations</strong> of 
<code>candidates</code> where the chosen numbers sum to <code>target</code>. You may return the combinations in <strong>any order</strong>.<br>
<br>
The <strong>same</strong> number may be chosen from <code>candidates</code> an <strong>unlimited number of times</strong>. Two combinations are unique if the [frequency]
of at least one of the chosen numbers is different.<br>
<br>
The test cases are generated such that the number of unique combinations that sum up to <code>target</code> is less than <code>150</code> combinations for the given input.<br>
<br>
<b>Example 1:</b><br>
<br>
<pre>
  <strong>Input:</strong> candidates = [2,3,6,7], target = 7
  <strong>Output:</strong> [[2,2,3],[7]]
  <strong>Explanation:</strong>
  2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
  7 is a candidate, and 7 = 7.
  These are the only two combinations.
</pre>
<br>
<b>Example 2:</b><br>
<br>
<pre>
  <strong>Input:</strong> candidates = [2,3,5], target = 8
  <strong>Output:</strong> [[2,2,2,2],[2,3,3],[3,5]]
</pre>
<br>
<b>Example 3:</b><br>
<br>
<pre>
  <strong>Input:</strong> candidates = [2], target = 1
  <strong>Output:</strong>[]
</pre>
<br>
<b>Constraints:</b><br>
<br>
<li><code>1 <= candidates.length <= 30</code></li>
<li><code>2 <= candidates[i] <= 40</code></li>
<li>All elements of <code>candidates</code> are <strong>distinct</strong>.</li>
<li><code>1 <= target <= 40</code></li>
