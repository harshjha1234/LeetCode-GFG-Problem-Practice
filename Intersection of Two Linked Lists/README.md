<h3>160. Intersection of Two Linked Lists</h3>
<br>
Given the heads of two singly linked-lists <code>headA</code> and <code>headB</code>, return the node at which the two lists intersect.<br>
If the two linked lists have no intersection at all, return <code>null</code>.<br>
<br>
For example, the following two linked lists begin to intersect at node <code>c1</code>:<br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/228013255-9222a495-7922-4108-a0c8-a7d4fec46f39.png">
<br>
The test cases are generated such that there are no cycles anywhere in the entire linked structure.<br>
<br>
<strong>Note</strong> that the linked lists must <strong>retain their original structure</strong> after the function returns.<br>
<br>
<strong>Custom Judge:</strong><br>
<br>
The inputs to the <strong>judge</strong> are given as follows (your program is <strong>not</strong> given these inputs):<br>
<li><code>intersectVal</code> - The value of the node where the intersection occurs. This is <code>0</code> if there is no intersected node.</li>
<li><code>listA</code> - The first linked list.</li>
<li><code>listB</code> - The second linked list.</li>
<li><code>skipA</code> - The number of nodes to skip ahead in <code>listA</code> (starting from the head) to get to the intersected node.</li>
<li><code>skipB</code> - The number of nodes to skip ahead in <code>listB</code> (starting from the head) to get to the intersected node.</li>
<br>
The judge will then create the linked structure based on these inputs and pass the two heads, <code>headA</code> and <code>headB</code> to your program. <br>
If you correctly return the intersected node, then your solution will be <strong>accepted</strong>.<br>
<br>
<b>Example 1:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/228013306-f070622b-5be4-4b61-b1d9-3e8ebdb4ebc0.png">
<br>
<pre>
<strong>Input:</strong> intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
<strong>Output:</strong> Intersected at '8'
<strong>Explanation:</strong> The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; 
There are 3 nodes before the intersected node in B.
- Note that the intersected node's value is not 1 because the nodes with value 1 in A and B (2nd node in A and 3rd node in B) are different node references. 
In other words, they point to two different locations in memory, while the nodes with value 8 in A and B (3rd node in A and 4th node in B) 
point to the same location in memory.
</pre>
<br>
<b>Example 2:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/228013348-886c1170-2f4b-4621-aeed-3250be8aa0df.png">
<br>
<pre>
<strong>Input:</strong> intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
<strong>Output:</strong> Intersected at '2'
<strong>Explanation:</strong> The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; 
There are 1 node before the intersected node in B.
</pre>
<br>
<b>Example 3:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/228013381-ab0b7965-0f3d-42cf-9b23-54582d26d174.png">
<br>
<pre>
<strong>Input:</strong> intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
<strong>Output:</strong> No intersection
<strong>Explanation:</strong> From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, 
intersectVal must be 0, while skipA and skipB can be arbitrary values.
Explanation: The two lists do not intersect, so return null.
</pre> 
<br>
<b>Constraints:</b><br>
<br>
<li>The number of nodes of <code>listA</code> is in the <code>m</code>.</li>
<li>The number of nodes of <code>listB</code> is in the <code>n</code>.</li>
<li><code>1 <= m, n <= 3 * 10<sup>4</sup></code></li>
<li><code>1 <= Node.val <= 10<sup>5</sup></code></li>
<li><code>0 <= skipA < m</code></li>
<li><code>0 <= skipB < n</code></li>
<li><code>intersectVal</code> is <code>0</code> if <code>listA</code> and <code>listB</code> do not intersect.</li>
<li><code>intersectVal == listA[skipA] == listB[skipB]</code> if <code>listA</code> and <code>listB</code> intersect.</li>
