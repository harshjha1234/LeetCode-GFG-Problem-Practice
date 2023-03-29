<h3>225. Implement Stack using Queues</h3>
<br>
Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack <br>
should support all the functions of a normal stack (<code>push</code>, <code>top</code>, <code>pop</code>, and <code>empty</code>).<br>
<br>
<strong>Implement the <code>MyStack</code> class:</strong><br>
<br>
<li><code>void push(int x)</code> Pushes element x to the top of the stack.</li>
<li><code>int pop()</code> Removes the element on the top of the stack and returns it.</li>
<li><code>int top()</code> Returns the element on the top of the stack.</li>
<li><code>boolean empty()</code> Returns <code>true</code> if the stack is empty, <code>false</code> otherwise.</li>
<br>
<strong>Notes:</strong><br>
<br>
<li>You must use only standard operations of a queue, which means that only <code>push to back</code>, <code>peek/pop from front</code>, <code>size</code> and <code>is empty</code> operations are valid.</li>
<li>Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque 
 (double-ended queue) as long as you use only a queue's standard operations.</li>
<br>
<b>Example 1:</b><br>
<br>
<pre>
<strong>Input</strong>
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
<strong>Output</strong>
[null, null, null, 2, 2, false]

<strong>Explanation</strong>
MyStack myStack = new MyStack();
myStack.push(1);
myStack.push(2);
myStack.top(); // return 2
myStack.pop(); // return 2
myStack.empty(); // return False
</pre>
<br>
<b>Constraints:</b><br>
<li><code>1 <= x <= 9</code></li>
<li>At most <code>100</code> calls will be made to <code>push</code>, <code>pop</code>, <code>top</code>, and <code>empty</code>.</li>
<li>All the calls to <code>pop</code> and <code>top</code> are valid.</li>
