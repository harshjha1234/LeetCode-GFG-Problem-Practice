<h3>141. Linked List Cycle</h3><br>
<br>
Given head, the head of a linked list, determine if the linked list has a cycle in it.<br>
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.<br>
Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.<br>
Return true if there is a cycle in the linked list. Otherwise, return false.<br>
<br>
<b>Example 1:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/222788002-96568736-6ea3-4df5-ba45-ee3220d3322b.png">
Input: head = [3,2,0,-4], pos = 1<br>
Output: true<br>
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).<br>
<br>
<b>Example 2:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/222788139-3d6a6866-39b6-483a-af10-ee27def8f27d.png">
Input: head = [1,2], pos = 0<br>
Output: true<br>
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.<br>
<br>
<b>Example 3:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/222788247-5f862b68-974f-47ff-ad3e-18288cf84436.png">
Input: head = [1], pos = -1<br>
Output: false<br>
Explanation: There is no cycle in the linked list.<br>
<br>
<b>Constraints:</b>
<br>
The number of the nodes in the list is in the range [0, 10^4].<br>
-10^5 <= Node.val <= 10^5<br>
pos is -1 or a valid index in the linked-list.<br>
