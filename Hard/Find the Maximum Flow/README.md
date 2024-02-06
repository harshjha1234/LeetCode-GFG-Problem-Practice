<h2><a href="https://www.geeksforgeeks.org/problems/find-the-maximum-flow2126/1?page=7&difficulty=Hard&sortBy=submissions">Find the Maximum Flow</a></h2><h3>Difficulty Level : Hard</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a graph&nbsp;which represents a flow network</span>&nbsp;<span style="font-size:18px">with N vertices numbered 1 to N and M edges.Find the maximum flow from vertex numbered 1 to vertex numbered N.</span></p>

<p><span style="font-size:18px">In a flow network,every edge has a flow&nbsp;capacity&nbsp;and the maximum flow of a path can't exceed the flow-capacity of an edge in the path.<br>
<br>
<strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 5, M =  4
Edges[]= {{1,2,1},{3,2,2},{4,2,3},{2,5,5}}
<strong>Output: </strong>1 
<strong>Explanation: </strong>
1 - 2 - 3
   / \
  4   5 
1 unit can flow from 1 -&gt; 2 - &gt;5 </span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 4, M = 4
Edges[] = {{1,2,8},{1,3,10},{4,2,2},{3,4,3}}
<strong>Output: </strong>5 
<strong>Explanation:</strong>
  1 - 2 
  |   |
  3 - 4
3 unit can flow from 1 -&gt; 3 -&gt; 4
2 unit can flow from 1 -&gt; 2 -&gt; 4
Total max flow from 1 to N = 3+2=5</span></pre>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function<strong>&nbsp;solve()</strong>&nbsp;which takes the <strong>N&nbsp;</strong>(the number of vertices) ,<strong>M </strong>(the number of Edges) and the array <strong>Edges</strong>[]&nbsp;(Where Edges[i]&nbsp;denoting an undirected edge between&nbsp;Edges[i][0] and&nbsp;Edges[i][1]&nbsp;with a flow capacity of Edges[i][2]),&nbsp;and returns the&nbsp;integer&nbsp;denoting the maximum flow from 1 to N.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(max_flow*M)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N+M)</span></p>

<p><span style="font-size:18px">Where max_flow is the maximum flow from&nbsp;1 to N</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N,M,Edges[i][2] &lt;= 1000</span><br>
<span style="font-size:18px">1 &lt;= Edges[i][0],Edges[i][1] &lt;= N</span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Graph</code>&nbsp;<code>Data Structures</code>&nbsp;