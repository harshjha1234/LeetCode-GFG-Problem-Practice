<h3>232. Implement Queue using Stacks</h3>
<br>
Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the <br>
functions of a normal queue(<code>push</code>, <code>peek</code>, <code>pop</code>, and <code>empty</code>).<br>
<br>
Implement the <code>MyQueue</code> class:<br>
<br>
<li><code>void push(int x)</code> Pushes element x to the back of the queue.</li>
<li><code>int pop()</code> Removes the element from the front of the queue and returns it.</li>
<li><code>int peek()</code> Returns the element at the front of the queue.</li>
<li><code>boolean empty()</code> Returns <code>true</code> if the queue is empty, <code>false</code> otherwise.</li>
<strong>Notes:</strong>
<li>You must use <strong>only</strong> standard operations of a stack, which means only <code>push to top</code>, <code>peek/pop from top</code>, <code>size</code>, 
and <code>is empty</code> operations are valid.</li>
<li>Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque 
(double-ended queue) as long as you use only a stack's standard operations.</li>
<br>
<b>Example 1:</b><br>
<br>
<pre>
  <strong>Input</strong>
  ["MyQueue", "push", "push", "peek", "pop", "empty"]
  [[], [1], [2], [], [], []]
  <strong>Output</strong>
  [null, null, null, 1, 1, false]
  <strong>Explanation</strong>
  MyQueue myQueue = new MyQueue();
  myQueue.push(1); // queue is: [1]
  myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
  myQueue.peek(); // return 1
  myQueue.pop(); // return 1, queue is [2]
  myQueue.empty(); // return false
</pre>
<br>
<b>Constraints:</b><br>
<br>
<li><code>1 <= x <= 9<code></li>
<li>At most <code>100</code> calls will be made to <code>push</code>, <code>pop</code>, <code>peek</code>, and <code>empty</code>.</li>
<li>All the calls to <code>pop</code> and <code>peek</code> are valid.</li>
